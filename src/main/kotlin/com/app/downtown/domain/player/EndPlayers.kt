package com.app.downtown.domain.player

import com.app.downtown.domain.Position
import com.app.downtown.domain.team.Team

data class EndPlayers(
    val endPlayers: List<EndPlayer>
) {

    fun filterByName(searchedWord: String): List<EndPlayer> {
        return endPlayers.filter { it.firstName.contains(searchedWord) || it.lastName.contains(searchedWord) }
    }

    fun filterByPosition(position: Position): List<EndPlayer> {
        return endPlayers.filter { it.position == position }
    }

    fun filterWithPriceSuperiorAt(price: Double): List<EndPlayer> {
        return endPlayers.filter { it.average.computePrice >= price }
    }

    fun filterWithPriceInferiorAt(price: Double): List<EndPlayer> {
        return endPlayers.filter { it.average.computePrice <= price }
    }

    fun filterByAscendingPrice(): List<EndPlayer> {
        return endPlayers.sortedBy { it.average.computePrice }
    }

    fun filterByDescendingPrice(): List<EndPlayer> {
        return endPlayers.sortedByDescending { it.average.computePrice }
    }

    fun searchByNameAndTeam(firstName: String, lastName: String, team: Team) = endPlayers.find {
        it.firstName == firstName && it.lastName == lastName && it.team == team
    }
}
