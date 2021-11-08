package com.app.downtown.infra.controller

import com.app.downtown.usecases.PlayerGeneration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController(
    private val playerGeneration: PlayerGeneration
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
}