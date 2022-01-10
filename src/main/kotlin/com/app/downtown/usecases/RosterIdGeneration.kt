package com.app.downtown.usecases

import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.roster.RosterRepository
import org.springframework.stereotype.Service

@Service
class RosterIdGeneration(
    private val rosterRepository: RosterRepository
) {
    operator fun invoke(userId: UserId) = rosterRepository.createRoster(userId)
}