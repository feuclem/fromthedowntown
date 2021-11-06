package com.app.downtown.infra

import com.app.downtown.domain.Average
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.Position
import com.app.downtown.domain.Team
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.infra.httpclient.JsoupClient
import org.jsoup.Jsoup

class PlayerRepository(
    private var jsoupClient: JsoupClient
) {

    companion object {
        val LAL_TEAM_LINK = Pair(Team.LOS_ANGELES_LAKERS, "https://www.basketball-reference.com/teams/LAL/2022.html")
    }

    fun getEndPlayers(teamLink: String, team: Team, playersAverages: List<PlayerWithAverage>): List<EndPlayer> {
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
                val playersAverage = playersAverages.find { it.firstName == playerNames[0] && it.lastName == playerNames[1] && it.team == team }
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

    fun getPlayerAverages(teamLink: String, team: Team): List<PlayerWithAverage> {
        val document = jsoupClient.get(teamLink)
        val table = document.select("body div#wrap div#content div#all_per_game-playoffs_per_game table")

        val rows = table.select("tr")

        return rows.mapIndexed { index, row ->
            val tds = row.select("td")

            if(index == 0) {
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

    private fun parsePosition(pos: String): Position {
        return when(pos) {
            "PF" -> Position.POWER_FORWARD
            "PG" -> Position.POINT_GUARD
            "SF" -> Position.SMALL_FORWARD
            "SG" -> Position.SHOOTING_GUARD
            else -> Position.CENTER
        }
    }
}