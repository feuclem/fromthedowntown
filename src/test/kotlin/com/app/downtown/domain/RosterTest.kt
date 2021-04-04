package com.app.downtown.domain

import com.app.downtown.domain.PlayerDummy.jamesHarden
import com.app.downtown.domain.Team.BROOKLYN_NETS
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RosterTest {

    @Test
    fun `add a player to the current roster`() {
        val player = jamesHarden
        val roster = Roster()

        roster.addPlayer(player)

        val expected = Roster(players = mutableListOf(player))
        assertEquals(expected, roster)
    }

    @Test
    fun `delete a player to the current roster`() {
        val player = jamesHarden
        val roster = Roster(players = mutableListOf(player))

        roster.deletePlayer(player)

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