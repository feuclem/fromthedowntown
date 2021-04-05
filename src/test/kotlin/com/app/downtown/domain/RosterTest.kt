package com.app.downtown.domain

import com.app.downtown.PlayerDummy.jamesHarden
import com.app.downtown.domain.Team.BROOKLYN_NETS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RosterTest {

    @Test
    fun `add a titular player to the current roster and decrease total credit of player price amount`() {
        val player = jamesHarden
        val roster = Roster()

        roster.addTitularPlayer(player)

        val expected = Roster(titularPlayers = RosterPlayers(mutableListOf(jamesHarden)), totalCredit = 203.8)
        assertEquals(expected, roster)
    }

    @Test
    fun `remove a titular player to the current roster and increase total credit of player price amount`() {
        val player = jamesHarden
        val roster = Roster(titularPlayers = RosterPlayers(mutableListOf(player)), totalCredit = 203.8)

        roster.removeTitularPlayer(player)

        val expected = Roster()
        assertEquals(expected, roster)
    }

    @Test
    fun `add a substitute player to the current roster`() {
        val player = jamesHarden
        val roster = Roster()

        roster.addSubstitutePlayer(player)

        val expected = Roster(substitutePlayers = RosterPlayers(mutableListOf(jamesHarden)), totalCredit = 203.8)
        assertEquals(expected, roster)
    }

    @Test
    fun `remove a substitute player to the current roster`() {
        val player = jamesHarden
        val roster = Roster(substitutePlayers = RosterPlayers(mutableListOf(player)), totalCredit = 203.8)

        roster.removeSubstitutePlayer(player)

        val expected = Roster()
        assertEquals(expected, roster)
    }

    @Test
    fun `add a trainer to the current roster`() {
        val trainer = Trainer(
            firstName = "Steeve",
            lastName = "Nash",
            team = BROOKLYN_NETS,
            numberOfVictory = 34,
            numberOfDefeat = 15,
            price = 23.0
        )
        val roster = Roster()

        roster.addTrainer(trainer)

        val expected = Roster(trainer = trainer)
        assertEquals(expected, roster)
    }

    @Test
    fun `delete a trainer to the current roster`() {
        val trainer = Trainer(
            firstName = "Steeve",
            lastName = "Nash",
            team = BROOKLYN_NETS,
            numberOfVictory = 34,
            numberOfDefeat = 15,
            price = 23.0
        )
        val roster = Roster(trainer = trainer)

        roster.deleteTrainer()

        val expected = Roster()
        assertEquals(expected, roster)
    }
}