package com.app.downtown.infra.controller

import com.app.downtown.domain.roster.Roster
import com.app.downtown.domain.user.UserId
import com.app.downtown.usecases.AddTitularPlayerToRoster
import com.app.downtown.usecases.AddTitularPlayerToRoster.AddTitularPlayerToRosterParameters
import com.app.downtown.usecases.RemoveTitularPlayerToRoster
import com.app.downtown.usecases.RosterIdGeneration
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RosterController(
    private val rosterIdGeneration: RosterIdGeneration,
    private val addTitularPlayerToRoster: AddTitularPlayerToRoster,
    private val removeTitularPlayerToRoster: RemoveTitularPlayerToRoster,
) {

    data class HandlePlayerToRosterBodyRequest(
        val userId: String,
        val firstName: String,
        val lastName: String,
        val team: String,
    )

    @CrossOrigin(origins = ["http://localhost:4200"])
    @PostMapping("/rosters/addTitular")
    fun addTitularPlayerToRoster(
        @RequestBody
        parameters: HandlePlayerToRosterBodyRequest
    ): RostersRestResource = with(parameters) {
        rosterIdGeneration.invoke(userId = UserId(userId))
        val roster = addTitularPlayerToRoster.invoke(
            userId = UserId(userId),
            parameters = AddTitularPlayerToRosterParameters(
                firstName = firstName,
                lastName = lastName,
                team = team
            )
        )
        toRostersRestResource(roster)
    }

    @CrossOrigin(origins = ["http://localhost:4200"])
    @PostMapping("/rosters/removeTitular")
    fun removeTitularPlayerToRoster(
        @RequestBody
        parameters: HandlePlayerToRosterBodyRequest
    ): RostersRestResource = with(parameters) {
        val roster = removeTitularPlayerToRoster.invoke(
            userId = UserId(userId),
            parameters = RemoveTitularPlayerToRoster.RemoveTitularPlayerToRosterParameters(
                firstName = firstName,
                lastName = lastName,
                team = team
            )
        )
        toRostersRestResource(roster)
    }

    private fun toRostersRestResource(roster: Roster) = RostersRestResource(
        titularPlayers = roster.titularPlayers.players.map {
            PlayerRestResource(
                firstName = it.firstName,
                lastName = it.lastName,
                team = it.team.name,
                number = it.number,
                position = it.position.name,
                pointPerMatch = it.average.pointPerMatch.toString(),
                reboundPerMatch = it.average.reboundPerMatch.toString(),
                assistPerMatch = it.average.assistPerMatch.toString(),
                totalCost = it.average.computePrice.toString(),
            )
        }
    )
}