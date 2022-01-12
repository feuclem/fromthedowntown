package com.app.downtown.infra.repositories.player

import com.app.downtown.domain.Average
import com.app.downtown.domain.Cache
import com.app.downtown.domain.Position
import com.app.downtown.domain.filter.PositionSorting
import com.app.downtown.domain.filter.PositionSorting.*
import com.app.downtown.domain.filter.PositionSorting.Nothing
import com.app.downtown.domain.filter.PriceSorting
import com.app.downtown.domain.filter.PriceSorting.*
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.player.EndPlayers
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.domain.team.Team
import com.app.downtown.infra.repositories.httpclient.JsoupClient
import com.app.downtown.infra.repositories.player.PlayerConstant.allTeams
import org.springframework.stereotype.Repository


@Repository
class PlayerRepository(
    private val jsoupClient: JsoupClient,
    private val cache: Cache
) {

    companion object {
        const val CACHE_KEY = "PLAYER_LIST"
    }

    fun getAllEndPlayersForAllTeams(): EndPlayers {
        cache.get(CACHE_KEY, EndPlayers::class.java)?.run { return this }

        return EndPlayers(
            endPlayers = allTeams.flatMap { linkTeam ->
                getEndPlayers(
                    teamLink = linkTeam.second,
                    team = linkTeam.first,
                    playersAverages = getPlayerAverages(teamLink = linkTeam.second, team = linkTeam.first)
                )
            }
        ).also { cache.set(CACHE_KEY, it) }
    }

    fun getPlayersByFilter(positionSorting: PositionSorting, priceSorting: PriceSorting): EndPlayers {
        val endPlayers = getAllEndPlayersForAllTeams()
        val filteredPlayersByPosition = when(positionSorting) {
            is PositionChoose -> EndPlayers(endPlayers.filterByPosition(positionSorting.position))
            Nothing -> endPlayers
        }
        return when(priceSorting) {
            Ascending -> EndPlayers(filteredPlayersByPosition.filterByAscendingPrice())
            Descending -> EndPlayers(filteredPlayersByPosition.filterByDescendingPrice())
            PriceSorting.Nothing -> filteredPlayersByPosition
        }
    }

    internal fun getEndPlayers(
        teamLink: String,
        team: Team,
        playersAverages: List<PlayerWithAverage>
    ): List<EndPlayer> {
        val document = jsoupClient.get(teamLink)
        val table = document.select("body div#wrap div#content div#all_roster div#div_roster table")
        val rows = table.select("tr")

        return rows.map { row ->
            val tds = row.select("td")
            if (tds.isEmpty()) {
                EndPlayer(
                    firstName = "",
                    lastName = "",
                    team = team,
                    number = "0",
                    position = Position.POINT_GUARD,
                    average = Average(
                        pointPerMatch = 0.00,
                        reboundPerMatch = 0.00,
                        assistPerMatch = 0.00,
                    ),
                )
            } else {
                val playerNames = row.select("td").select("[data-stat=\"player\"]").text().split(" ")
                val number = row.select("th").text()
                val position = row.select("td").select("[data-stat=\"pos\"]").text()
                val playersAverage =
                    playersAverages.find {
                        it.firstName == playerNames[0] && it.lastName == playerNames[1] && it.team == team
                    }
                EndPlayer(
                    firstName = playerNames[0],
                    lastName = playerNames[1],
                    team = team,
                    number = number.ifEmpty { "0" },
                    position = parsePosition(position),
                    average = Average(
                        pointPerMatch = playersAverage?.average?.pointPerMatch ?: 0.00,
                        reboundPerMatch = playersAverage?.average?.reboundPerMatch ?: 0.00,
                        assistPerMatch = playersAverage?.average?.assistPerMatch ?: 0.00,
                    ),
                )
            }
        }.filter { it.firstName.isBlank().not() }
    }

    internal fun getPlayerAverages(teamLink: String, team: Team): List<PlayerWithAverage> {
        val document = jsoupClient.get(teamLink)
        val table = document.select("body div#wrap div#content div#all_per_game-playoffs_per_game table")

        val rows = table.select("tr")

        return rows.mapIndexed { index, row ->
            val tds = row.select("td")

            if (index == 0) {
                PlayerWithAverage(
                    firstName = "",
                    lastName = "",
                    team = team,
                    average = Average(
                        pointPerMatch = 0.00,
                        reboundPerMatch = 0.00,
                        assistPerMatch = 0.00,
                    )
                )
            } else {
                val name = tds.select("[data-stat=\"player\"]").text().split(" ")
                val points = tds.select("[data-stat=\"pts_per_g\"]").text().toDouble()
                val rebounds = tds.select("[data-stat=\"trb_per_g\"]").text().toDouble()
                val assists = tds.select("[data-stat=\"ast_per_g\"]").text().toDouble()
                PlayerWithAverage(
                    firstName = name[0],
                    lastName = name[1],
                    team = team,
                    average = Average(
                        pointPerMatch = points,
                        reboundPerMatch = rebounds,
                        assistPerMatch = assists,
                    )
                )
            }
        }.filter { it.firstName.isBlank().not() }
    }

    private fun parsePosition(position: String): Position {
        return when (position) {
            "PF" -> Position.POWER_FORWARD
            "PG" -> Position.POINT_GUARD
            "SF" -> Position.SMALL_FORWARD
            "SG" -> Position.SHOOTING_GUARD
            else -> Position.CENTER
        }
    }
}