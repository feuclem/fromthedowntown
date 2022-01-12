package com.app.downtown.usecases

import com.app.downtown.domain.filter.PositionSorting
import com.app.downtown.domain.filter.PriceSorting
import com.app.downtown.infra.repositories.player.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerFilter(
    private val playerRepository: PlayerRepository
) {
    operator fun invoke(positionSorting: PositionSorting, priceSorting: PriceSorting) = playerRepository.getPlayersByFilter(
        positionSorting = positionSorting,
        priceSorting = priceSorting
    )
}