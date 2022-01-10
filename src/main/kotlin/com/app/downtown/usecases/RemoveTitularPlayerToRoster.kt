package com.app.downtown.usecases

import com.app.downtown.domain.team.TeamParser
import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.roster.RosterRepository
import org.springframework.stereotype.Service

@Service
class RemoveTitularPlayerToRoster(
    private val rosterRepository: RosterRepository
) {
    data class RemoveTitularPlayerToRosterParameters(
        val firstName: String,
        val lastName: String,
        val team: String,
    )

    operator fun invoke(userId: UserId, parameters: RemoveTitularPlayerToRosterParameters) = with(parameters) {
        rosterRepository.removeTitularPlayerToRoster(
            userId = userId,
            firstName = firstName,
            lastName = lastName,
            team = TeamParser.parseTeam(team)
        )
    }
}