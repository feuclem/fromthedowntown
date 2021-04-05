package com.app.downtown.domain

import com.app.downtown.PlayerDummy.aaronGordon
import com.app.downtown.PlayerDummy.devinBooker
import com.app.downtown.PlayerDummy.donovanMitchell
import com.app.downtown.PlayerDummy.garrisonMathews
import com.app.downtown.PlayerDummy.jamesHarden
import com.app.downtown.PlayerDummy.jimmyButler
import com.app.downtown.PlayerDummy.joelEmbiid
import com.app.downtown.PlayerDummy.juliusRandle
import com.app.downtown.PlayerDummy.karlAntonyTowns
import com.app.downtown.PlayerDummy.kawhiLeonard
import com.app.downtown.PlayerDummy.lameloBall
import com.app.downtown.PlayerDummy.rosterTitularPlayers
import com.app.downtown.PlayerDummy.stephenCurry
import com.app.downtown.PlayerDummy.tobiasHarris
import com.app.downtown.PlayerDummy.zionWilliamson
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

    @Test
    fun `is center player not addable when there is already a center in roster`() {
        val player = joelEmbiid
        val roster = RosterPlayers(mutableListOf(karlAntonyTowns))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is power forward player not addable when there is already a 2 power forwards in roster`() {
        val player = aaronGordon
        val roster = RosterPlayers(mutableListOf(zionWilliamson, juliusRandle))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is small forward player not addable when there is already a 2 small forwards in roster`() {
        val player = tobiasHarris
        val roster = RosterPlayers(mutableListOf(jimmyButler, kawhiLeonard))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is forward player not addable when there is already a 2 forwards in roster`() {
        val player = tobiasHarris
        val roster = RosterPlayers(mutableListOf(zionWilliamson, kawhiLeonard))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is shooting guard player not addable when there is already a 2 shooting guards in roster`() {
        val player = garrisonMathews
        val roster = RosterPlayers(mutableListOf(donovanMitchell, devinBooker))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is point guard player not addable when there is already a 2 point guards in roster`() {
        val player = lameloBall
        val roster = RosterPlayers(mutableListOf(jamesHarden, stephenCurry))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }

    @Test
    fun `is guard player not addable when there is already a 2 guards in roster`() {
        val player = lameloBall
        val roster = RosterPlayers(mutableListOf(devinBooker, stephenCurry))

        val result = roster.isPlayerAddable(player)

        assertFalse(result)
    }
}