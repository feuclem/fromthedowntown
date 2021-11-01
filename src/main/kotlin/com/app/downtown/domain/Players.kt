package com.app.downtown.domain

import com.app.downtown.domain.player.EndPlayer

data class Players(
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
}
