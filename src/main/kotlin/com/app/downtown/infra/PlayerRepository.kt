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
        val PHILADELPHIA_76_ERS_LINK = Pair(Team.PHILADELPHIA_76_ERS, "https://www.basketball-reference.com/teams/PHI/2022.html")
        val CHICAGO_BULLS_LINK = Pair(Team.CHICAGO_BULLS, "https://www.basketball-reference.com/teams/CHI/2022.html")
        val BROOKLYN_NETS_LINK = Pair(Team.BROOKLYN_NETS, "https://www.basketball-reference.com/teams/BRK/2022.html")
        val NEW_YORK_KNICKS_LINK = Pair(Team.NEW_YORK_KNICKS, "https://www.basketball-reference.com/teams/NYK/2022.html")
        val WASHINGTON_WIZARDS_LINK = Pair(Team.WASHINGTON_WIZARDS, "https://www.basketball-reference.com/teams/WAS/2022.html")
        val CLEVELAND_CAVALIERS_LINK = Pair(Team.CLEVELAND_CAVALIERS, "https://www.basketball-reference.com/teams/CLE/2022.html")
        val TORONTO_RAPTORS_LINK = Pair(Team.TORONTO_RAPTORS, "https://www.basketball-reference.com/teams/TOR/2022.html")
        val MILWAUKEE_BUCKS_LINK = Pair(Team.MILWAUKEE_BUCKS, "https://www.basketball-reference.com/teams/MIL/2022.html")
        val CHARLOTTE_HORNETS_LINK = Pair(Team.CHARLOTTE_HORNETS, "https://www.basketball-reference.com/teams/CHO/2022.html")
        val BOSTON_CELTICS_LINK = Pair(Team.BOSTON_CELTICS, "https://www.basketball-reference.com/teams/BOS/2022.html")
        val ATLANTA_HAWKS_LINK = Pair(Team.ATLANTA_HAWKS, "https://www.basketball-reference.com/teams/ATL/2022.html")
        val INDIANA_PACERS_LINK = Pair(Team.INDIANA_PACERS, "https://www.basketball-reference.com/teams/IND/2022.html")
        val ORLANDO_MAGIC_LINK = Pair(Team.ORLANDO_MAGIC, "https://www.basketball-reference.com/teams/ORL/2022.html")
        val DETROIT_PISTONS_LINK = Pair(Team.DETROIT_PISTONS, "https://www.basketball-reference.com/teams/DET/2022.html")
        val UTAH_JAZZ_LINK = Pair(Team.UTAH_JAZZ, "https://www.basketball-reference.com/teams/UTA/2022.html")
        val GOLDEN_STATE_WARRIORS_LINK = Pair(Team.GOLDEN_STATE_WARRIORS, "https://www.basketball-reference.com/teams/GSW/2022.html")
        val DALLAS_MAVERICKS_LINK = Pair(Team.DALLAS_MAVERICKS, "https://www.basketball-reference.com/teams/DAL/2022.html")
        val PHOENIX_SUNS_LINK = Pair(Team.PHOENIX_SUNS, "https://www.basketball-reference.com/teams/PHO/2022.html")
        val LOS_ANGELES_LAKERS_LINK = Pair(Team.LOS_ANGELES_LAKERS, "https://www.basketball-reference.com/teams/LAL/2022.html")
        val MEMPHIS_GRIZZLIES_LINK = Pair(Team.MEMPHIS_GRIZZLIES, "https://www.basketball-reference.com/teams/MEM/2022.html")
        val SACRAMENTO_KINGS_LINK = Pair(Team.SACRAMENTO_KINGS, "https://www.basketball-reference.com/teams/SAC/2022.html")
        val DENVER_NUGGETS_LINK = Pair(Team.DENVER_NUGGETS, "https://www.basketball-reference.com/teams/DEN/2022.html")
        val LOS_ANGELES_CLIPPERS_LINK = Pair(Team.LOS_ANGELES_CLIPPERS, "https://www.basketball-reference.com/teams/LAC/2022.html")
        val PORTLAND_TRAIL_BLAZERS_LINK = Pair(Team.PORTLAND_TRAIL_BLAZERS, "https://www.basketball-reference.com/teams/POR/2022.html")
        val MINNESOTA_TIMBERWOLVES_LINK = Pair(Team.MINNESOTA_TIMBERWOLVES, "https://www.basketball-reference.com/teams/MIN/2022.html")
        val SAN_ANTONIO_SPURS_LINK = Pair(Team.SAN_ANTONIO_SPURS, "https://www.basketball-reference.com/teams/SAS/2022.html")
        val OKLAHOMA_CITY_THUNDER_LINK = Pair(Team.OKLAHOMA_CITY_THUNDER, "https://www.basketball-reference.com/teams/OKC/2022.html")
        val HOUSTON_ROCKETS_LINK = Pair(Team.HOUSTON_ROCKETS, "https://www.basketball-reference.com/teams/HOU/2022.html")
        val NEW_ORLEANS_PELICANS_LINK = Pair(Team.NEW_ORLEANS_PELICANS, "https://www.basketball-reference.com/teams/NOP/2022.html")
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