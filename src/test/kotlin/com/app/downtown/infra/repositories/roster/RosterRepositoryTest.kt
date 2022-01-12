package com.app.downtown.infra.repositories.roster

import com.app.downtown.InMemoryCache
import com.app.downtown.PlayerDummy
import com.app.downtown.PlayerDummy.players
import com.app.downtown.domain.Average
import com.app.downtown.domain.Position
import com.app.downtown.domain.RosterPlayers
import com.app.downtown.domain.TotalCredit
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.player.EndPlayers
import com.app.downtown.domain.roster.Roster
import com.app.downtown.domain.roster.RosterPossibilities
import com.app.downtown.domain.team.Team
import com.app.downtown.domain.user.UserId
import com.app.downtown.infra.repositories.player.PlayerRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class RosterRepositoryTest {

    private val cache = InMemoryCache()

    @Mock
    private lateinit var playerRepository: PlayerRepository

    private val rosterRepository by lazy {
        RosterRepository(
            playerRepository = playerRepository,
            cache = cache
        )
    }

    @Test
    @DisplayName("it should add player in roster")
    fun itShouldAddPlayerInRoster() {
        // GIVEN
        mockGetAllEndPlayersForAllTeams()
        rosterRepository.createRoster(userId = UserId("1xxx1"))

        val expected = RosterPossibilities.RosterUpdated(
            updatedRoster = Roster(
                titularPlayers = RosterPlayers(mutableListOf(PlayerDummy.jamesHarden)),
                totalCredit = TotalCredit(amount = 103.80000000000001)
            )
        )

        // WHEN
        val actual = rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "James",
            lastName = "Harden",
            team = Team.BROOKLYN_NETS,
        )

        // THEN
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("it should add player in roster from cache")
    fun itShouldAddPlayerInRosterFromCache() {
        // GIVEN
        mockGetAllEndPlayersForAllTeams()

        val expected = RosterPossibilities.RosterUpdated(
            updatedRoster = Roster(
                titularPlayers = RosterPlayers(
                    mutableListOf(
                        PlayerDummy.jamesHarden,
                        PlayerDummy.joelEmbiid,
                        PlayerDummy.zionWilliamson,
                        PlayerDummy.luguentzDort,
                        PlayerDummy.donovanMitchell,
                    )
                ),
                totalCredit = TotalCredit(
                    amount = 4.500000000000018
                )
            )
        )
        // WHEN
        rosterRepository.createRoster(userId = UserId("1xxx1"))
        rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "James",
            lastName = "Harden",
            team = Team.BROOKLYN_NETS,
        )
        rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "Joel",
            lastName = "Embiid",
            team = Team.PHILADELPHIA_76_ERS,
        )
        rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "Zion",
            lastName = "Williamson",
            team = Team.NEW_ORLEANS_PELICANS,
        )
        rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "Luguentz",
            lastName = "Dort",
            team = Team.OKLAHOMA_CITY_THUNDER,
        )
        val actual = rosterRepository.addTitularPlayerToRoster(
            userId = UserId("1xxx1"),
            firstName = "Donovan",
            lastName = "Mitchell",
            team = Team.UTAH_JAZZ,
        )

        // THEN
        assertEquals(expected, actual)
    }

    private fun mockGetAllEndPlayersForAllTeams() {
        given(playerRepository.getAllEndPlayersForAllTeams()).willReturn(
            EndPlayers(endPlayers = players)
        )
    }
}