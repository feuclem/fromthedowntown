package com.app.downtown.infra

import com.app.downtown.PlayerDummy.lalPlayers
import com.app.downtown.domain.Average
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.Position
import com.app.downtown.domain.Team
import com.app.downtown.domain.player.PlayerWithAverage
import com.app.downtown.infra.httpclient.JsoupClient
import org.jsoup.Jsoup
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class PlayerRepositoryTest {

    @Mock
    private lateinit var jsoupClient: JsoupClient

    @InjectMocks
    private lateinit var getPlayerPageIdsRepository: PlayerRepository

    @Test
    fun `get lakers players`() {
        val teamLink = "https://www.basketball-reference.com/teams/LAL/2022.html"
        given(jsoupClient.get(teamLink)).willReturn(Jsoup.parse(lalPlayers))
        val expectedLebronJames = PlayerWithAverage(
            firstName = "LeBron",
            lastName = "James",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 23.8,
                reboundPerMatch = 5.8,
                assistPerMatch = 6.4
            )
        )
        val expectedAnthonyDavis = PlayerWithAverage(
            firstName = "Anthony",
            lastName = "Davis",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 24.7,
                reboundPerMatch = 11.4,
                assistPerMatch = 2.6
            )
        )
        val expectedRussellWestbrook = PlayerWithAverage(
            firstName = "Russell",
            lastName = "Westbrook",
            team = Team.LOS_ANGELES_LAKERS,
            average = Average(
                pointPerMatch = 18.3,
                reboundPerMatch = 8.7,
                assistPerMatch = 8.7
            )
        )

        val actual = getPlayerPageIdsRepository.getPlayerAverages(teamLink)

        assertEquals(expectedLebronJames, actual[0])
        assertEquals(expectedAnthonyDavis, actual[1])
        assertEquals(expectedRussellWestbrook, actual[2])
    }
}