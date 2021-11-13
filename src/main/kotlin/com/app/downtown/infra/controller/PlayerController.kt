package com.app.downtown.infra.controller

import com.app.downtown.domain.Position
import com.app.downtown.usecases.PlayerFilterByPosition
import com.app.downtown.usecases.PlayerGeneration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController(
    private val playerGeneration: PlayerGeneration,
    private val playerFilterByPosition: PlayerFilterByPosition
) {

    @GetMapping("/players/generation")
    fun playerGeneration(): List<PlayerRestResource> = playerGeneration.invoke().map {
        PlayerRestResource(
            firstName = it.firstName,
            lastName = it.lastName,
            team = it.team.name,
            number = it.number,
            position = it.position.name,
            pointPerMatch = it.average.pointPerMatch.toString(),
            reboundPerMatch = it.average.reboundPerMatch.toString(),
            assistPerMatch = it.average.assistPerMatch.toString(),
        )
    }

    @GetMapping("/players")
    fun playersByPosition(
        @RequestParam("position") position: String
    ): List<PlayerRestResource> = playerFilterByPosition.invoke(Position.POINT_GUARD).map {
        PlayerRestResource(
            firstName = it.firstName,
            lastName = it.lastName,
            team = it.team.name,
            number = it.number,
            position = it.position.name,
            pointPerMatch = it.average.pointPerMatch.toString(),
            reboundPerMatch = it.average.reboundPerMatch.toString(),
            assistPerMatch = it.average.assistPerMatch.toString(),
        )
    }
}