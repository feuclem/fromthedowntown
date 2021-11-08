package com.app.downtown.usecases

import com.app.downtown.infra.repositories.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerGeneration(
    private val playerRepository: PlayerRepository
) {

    operator fun invoke() = playerRepository.getAllEndPlayersForAllTeams()
}