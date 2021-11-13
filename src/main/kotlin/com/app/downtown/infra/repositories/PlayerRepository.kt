package com.app.downtown.infra.repositories

import com.app.downtown.domain.Average
import com.app.downtown.domain.Cache
import com.app.downtown.domain.Position
import com.app.downtown.domain.Team
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.player.EndPlayers
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.infra.repositories.PlayerConstant.allTeams
import com.app.downtown.infra.repositories.httpclient.JsoupClient
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.stereotype.Repository


@Repository
class PlayerRepository(
    private val jsoupClient: JsoupClient,
    private val cache: Cache
) {

    companion object {
        const val CACHE_KEY = "PLAYER_LIST"
    }

    fun getAllEndPlayersForAllTeams(): List<EndPlayer> {
        cache.get(CACHE_KEY, EndPlayers::class.java)?.run { return this.endPlayers }

        return allTeams.flatMap { linkTeam ->
            getEndPlayers(
                teamLink = linkTeam.second,
                team = linkTeam.first,
                playersAverages = getPlayerAverages(teamLink = linkTeam.second, team = linkTeam.first)
            )
        }.also { cache.set(CACHE_KEY, EndPlayers(it)) }
    }

    fun getPlayersByPosition(position: Position) = getAllEndPlayersForAllTeams().filter { it.position == position }

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
                    playersAverages.find { it.firstName == playerNames[0] && it.lastName == playerNames[1] && it.team == team }
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
                    team = Team.LOS_ANGELES_LAKERS,
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

    private fun parseTeam(team: String): Team {
        return when (team) {
            "ATLANTA_HAWKS" -> Team.ATLANTA_HAWKS
            "BOSTON_CELTICS" -> Team.BOSTON_CELTICS
            "BROOKLYN_NETS" -> Team.BROOKLYN_NETS
            "CHARLOTTE_HORNETS" -> Team.CHARLOTTE_HORNETS
            "CHICAGO_BULLS" -> Team.CHICAGO_BULLS
            "CLEVELAND_CAVALIERS" -> Team.CLEVELAND_CAVALIERS
            "DALLAS_MAVERICKS" -> Team.DALLAS_MAVERICKS
            "DENVER_NUGGETS" -> Team.DENVER_NUGGETS
            "DETROIT_PISTONS" -> Team.DETROIT_PISTONS
            "GOLDEN_STATE_WARRIORS" -> Team.GOLDEN_STATE_WARRIORS
            "HOUSTON_ROCKETS" -> Team.HOUSTON_ROCKETS
            "INDIANA_PACERS" -> Team.INDIANA_PACERS
            "LOS_ANGELES_CLIPPERS" -> Team.LOS_ANGELES_CLIPPERS
            "LOS_ANGELES_LAKERS" -> Team.LOS_ANGELES_LAKERS
            "MEMPHIS_GRIZZLIES" -> Team.MEMPHIS_GRIZZLIES
            "MIAMI_HEAT" -> Team.MIAMI_HEAT
            "MILWAUKEE_BUCKS" -> Team.MILWAUKEE_BUCKS
            "MINNESOTA_TIMBERWOLVES" -> Team.MINNESOTA_TIMBERWOLVES
            "NEW_ORLEANS_PELICANS" -> Team.NEW_ORLEANS_PELICANS
            "NEW_YORK_KNICKS" -> Team.NEW_YORK_KNICKS
            "OKLAHOMA_CITY_THUNDER" -> Team.OKLAHOMA_CITY_THUNDER
            "ORLANDO_MAGIC" -> Team.ORLANDO_MAGIC
            "PHILADELPHIA_76_ERS" -> Team.PHILADELPHIA_76_ERS
            "PHOENIX_SUNS" -> Team.PHOENIX_SUNS
            "PORTLAND_TRAIL_BLAZERS" -> Team.PORTLAND_TRAIL_BLAZERS
            "SACRAMENTO_KINGS" -> Team.SACRAMENTO_KINGS
            "SAN_ANTONIO_SPURS" -> Team.SAN_ANTONIO_SPURS
            "TORONTO_RAPTORS" -> Team.TORONTO_RAPTORS
            "UTAH_JAZZ" -> Team.UTAH_JAZZ
            else -> Team.WASHINGTON_WIZARDS
        }
    }
}