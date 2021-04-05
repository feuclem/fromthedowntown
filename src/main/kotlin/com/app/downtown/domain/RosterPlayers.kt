package com.app.downtown.domain

data class RosterPlayers(
    private val list: MutableList<Player> = mutableListOf()
) {

    fun add(player: Player) {
        list.add(player)
    }

    fun remove(player: Player) {
        list.remove(player)
    }

    fun isPlayerAddable(player: Player): Boolean {
        return list.contains(player).not() && list.size < 5
    }

    val get = list
}
