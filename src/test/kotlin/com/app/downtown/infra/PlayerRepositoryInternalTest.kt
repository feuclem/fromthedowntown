package com.app.downtown.infra

import com.app.downtown.PlayerDummy.lalPlayers
import com.app.downtown.domain.Average
import com.app.downtown.domain.Cache
import com.app.downtown.domain.Position
import com.app.downtown.domain.team.Team
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.infra.repositories.player.PlayerRepository
import com.app.downtown.infra.repositories.httpclient.JsoupClient
import org.jsoup.Jsoup
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class PlayerRepositoryInternalTest {

    @Mock
    private lateinit var jsoupClient: JsoupClient

    @Mock
    private lateinit var cache: Cache

    @InjectMocks
    private lateinit var playerRepository: PlayerRepository

    private val teamLink = "https://www.basketball-reference.com/teams/LAL/2022.html"
    private val team = Team.LOS_ANGELES_LAKERS

    @Test
    @Disabled("real test with http call")
    fun `get end players`() {
        // GIVEN
        given(jsoupClient.get(teamLink)).willReturn(Jsoup.parse(lalPlayers))
        val playersAverages = listOf(
            PlayerWithAverage(
                firstName = "Anthony",
                lastName = "Davis",
                team = Team.LOS_ANGELES_LAKERS,
                average = Average(
                    pointPerMatch = 24.7,
                    reboundPerMatch = 11.4,
                    assistPerMatch = 2.6
                )
            )

        )
        val expected = listOf(
            EndPlayer(
                firstName = "Anthony",
                lastName = "Davis",
                team = Team.LOS_ANGELES_LAKERS,
                number = "3",
                position = Position.CENTER,
                average = Average(
                    pointPerMatch = 24.7,
                    reboundPerMatch = 11.4,
                    assistPerMatch = 2.6
                )
            )
        )

        // WHEN
        val actual = playerRepository.getEndPlayers(teamLink, team, playersAverages)

        // THEN
        assertEquals(expected[0], actual[0])
    }

    @Test
    fun `get player averages`() {
        given(jsoupClient.get(teamLink)).willReturn(Jsoup.parse(lalPlayers))
        val expectedLebronJames = PlayerWithAverage(
            firstName = "LeBron",
            lastName = "James",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 28.7,
                reboundPerMatch = 7.4,
                assistPerMatch = 6.6
            )
        )
        val expectedAnthonyDavis = PlayerWithAverage(
            firstName = "Anthony",
            lastName = "Davis",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 23.3,
                reboundPerMatch = 9.9,
                assistPerMatch = 2.9
            )
        )
        val expectedRussellWestbrook = PlayerWithAverage(
            firstName = "Russell",
            lastName = "Westbrook",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 19.3,
                reboundPerMatch = 8.1,
                assistPerMatch = 8.3
            )
        )

        val actual = playerRepository.getPlayerAverages(teamLink, team)

        assertEquals(expectedLebronJames, actual[0])
        assertEquals(expectedRussellWestbrook, actual[1])
        assertEquals(expectedAnthonyDavis, actual[2])
    }
}