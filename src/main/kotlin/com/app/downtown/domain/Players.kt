package com.app.downtown.domain

data class Players(
    val players: List<Player>
) {

    fun filterByName(searchedWord: String): List<Player> {
        return players.filter { it.firstName.contains(searchedWord) || it.lastName.contains(searchedWord) }
    }

    fun filterByPosition(position: Position): List<Player> {
        return players.filter { it.position == position }
    }

    fun filterWithPriceSuperiorAt(price: Double): List<Player> {
        return players.filter { it.price >= price }
    }

    fun filterWithPriceInferiorAt(price: Double): List<Player> {
        return players.filter { it.price <= price }
    }

    fun filterByAscendingPrice(): List<Player> {
        return players.sortedBy { it.price }
    }

    fun filterByDescendingPrice(): List<Player> {
        return players.sortedByDescending { it.price }
    }
}
