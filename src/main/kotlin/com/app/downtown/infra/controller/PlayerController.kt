package com.app.downtown.infra.controller

import com.app.downtown.domain.PositionParser.parsePosition
import com.app.downtown.usecases.PlayerFilterByPosition
import com.app.downtown.usecases.PlayerGeneration
import java.math.RoundingMode
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController(
    private val playerGeneration: PlayerGeneration,
    private val playerFilterByPosition: PlayerFilterByPosition
) {

    @CrossOrigin(origins = ["http://localhost:4200"])
    @GetMapping("/players")
    fun playerGeneration(): List<PlayerRestResource> = playerGeneration.invoke().endPlayers.map {
        PlayerRestResource(
            firstName = it.firstName,
            lastName = it.lastName,
            team = it.team.name,
            number = it.number,
            position = it.position.name,
            pointPerMatch = it.average.pointPerMatch.toString(),
            reboundPerMatch = it.average.reboundPerMatch.toString(),
            assistPerMatch = it.average.assistPerMatch.toString(),
            totalCost = it.average.computePrice.toBigDecimal().setScale(2, RoundingMode.CEILING).toString(),
        )
    }

    @GetMapping("/players/filter")
    fun playersByPosition(
        @RequestParam("position") position: String
    ): List<PlayerRestResource> = playerFilterByPosition.invoke(parsePosition(position)).map {
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
}