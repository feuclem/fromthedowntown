package com.app.downtown.domain

import com.app.downtown.domain.Position.*
import com.app.downtown.domain.player.EndPlayer

data class RosterPlayers(
    private val list: MutableList<EndPlayer> = mutableListOf()
) {

    val players
        get() = list

    fun add(endPlayer: EndPlayer) {
        list.add(endPlayer)
    }

    fun remove(endPlayer: EndPlayer) {
        list.remove(endPlayer)
    }

    fun isPlayerAddable(endPlayer: EndPlayer): Boolean =
        list.contains(endPlayer).not()
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
