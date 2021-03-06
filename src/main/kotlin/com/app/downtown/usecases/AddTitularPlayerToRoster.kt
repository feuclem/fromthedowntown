package com.app.downtown.usecases

import com.app.downtown.domain.roster.RosterPossibilities
import com.app.downtown.domain.team.parseTeam
import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.roster.RosterRepository
import org.springframework.stereotype.Service

@Service
class AddTitularPlayerToRoster(
    private val rosterRepository: RosterRepository
) {
    data class AddTitularPlayerToRosterParameters(
        val firstName: String,
        val lastName: String,
        val team: String,
    )

    operator fun invoke(userId: UserId, parameters: AddTitularPlayerToRosterParameters): RosterPossibilities = with(parameters) {
        return rosterRepository.addTitularPlayerToRoster(
            userId = userId,
            firstName = firstName,
            lastName = lastName,
            team = parseTeam(team)
        )
    }
}