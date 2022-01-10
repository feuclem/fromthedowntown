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

    fun isPlayerAddable(endPlayer: EndPlayer): Boolean {
        if (list.contains(endPlayer).not() && list.size < 5) {
            return true
        }
        if (endPlayer.position == POINT_GUARD && list.any { it.position == POINT_GUARD }) {
            return false
        }
        if (endPlayer.position == SHOOTING_GUARD && list.any { it.position == SHOOTING_GUARD }) {
            return false
        }
        if (endPlayer.position == SMALL_FORWARD && list.any { it.position == SMALL_FORWARD }) {
            return false
        }
        if (endPlayer.position == POWER_FORWARD && list.any { it.position == POWER_FORWARD }) {
            return false
        }
        if (endPlayer.position == CENTER && list.any { it.position == CENTER }) {
            return false
        }
        return true
    }
}
