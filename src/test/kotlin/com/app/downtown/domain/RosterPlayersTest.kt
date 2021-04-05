package com.app.downtown.domain

import com.app.downtown.domain.PlayerDummy.jamesHarden
import com.app.downtown.domain.PlayerDummy.rosterTitularPlayers
import com.app.downtown.domain.PlayerDummy.stephenCurry
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RosterPlayersTest {

    @Test
    fun `is player addable when player is not already in roster`() {
        val player = jamesHarden
        val roster = RosterPlayers(mutableListOf())

        val result = roster.isPlayerAddable(player)

        assertTrue(result)
    }

    @Test
    fun `is player not addable when player is already in roster`() {
        val player = stephenCurry
        val roster = RosterPlayers(rosterTitularPlayers)

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is player not addable when the roster has more than 5 players`() {
        val player = jamesHarden
        val roster = RosterPlayers(rosterTitularPlayers)

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }
}