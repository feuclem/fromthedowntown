package com.app.downtown.domain

import com.app.downtown.domain.Position.*

data class RosterPlayers(
    private val list: MutableList<Player> = mutableListOf()
) {

    fun add(player: Player) {
        list.add(player)
    }

    fun remove(player: Player) {
        list.remove(player)
    }

    fun isPlayerAddable(player: Player): Boolean =
        list.contains(player).not()
                && list.size < 5
                && list.any { it.position == CENTER }.not()
                && list.count { it.position == POWER_FORWARD } < 2
                && list.count { it.position == SMALL_FORWARD } < 2
                && list.count { it.position == POWER_FORWARD || it.position == SMALL_FORWARD } < 2
                && list.count { it.position == SHOOTING_GUARD } < 2
                && list.count { it.position == POINT_GUARD } < 2
                && list.count { it.position == SHOOTING_GUARD || it.position == POINT_GUARD } < 2

    val get = list
}
