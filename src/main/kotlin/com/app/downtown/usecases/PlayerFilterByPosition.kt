package com.app.downtown.usecases

import com.app.downtown.domain.Position
import com.app.downtown.infra.repositories.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerFilterByPosition(
    private val playerRepository: PlayerRepository
) {
    operator fun invoke(position: Position) = playerRepository.getPlayersByPosition(position)
}