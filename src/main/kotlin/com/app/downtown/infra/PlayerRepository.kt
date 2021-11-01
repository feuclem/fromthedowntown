package com.app.downtown.infra

import com.app.downtown.domain.Average
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.Position
import com.app.downtown.domain.Team
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.infra.httpclient.JsoupClient

class PlayerRepository(
    private var jsoupClient: JsoupClient
) {

    companion object {
        val LAL_TEAM_LINK = Pair(Team.LOS_ANGELES_LAKERS, "https://www.basketball-reference.com/teams/LAL/2022.html")
    }

    fun getPlayerAverages(teamLink: String): List<PlayerWithAverage> {
        val document = jsoupClient.get(teamLink)
        val table = document.select("body div#wrap div#content div#all_per_game-playoffs_per_game table")

        val rows = table.select("tr")

        return rows.mapIndexed { index, row ->
            val tds = row.select("td")

            if(index == 0) {
                PlayerWithAverage(
                    firstName = "",
                    lastName = "",
                    team = Team.LOS_ANGELES_LAKERS,
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
}