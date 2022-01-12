package com.app.downtown.infra

import com.app.downtown.InMemoryCache
import com.app.downtown.PlayerDummy.bullsPlayers
import com.app.downtown.PlayerDummy.lalPlayers
import com.app.downtown.domain.Average
import com.app.downtown.domain.Position
import com.app.downtown.domain.filter.PositionSorting
import com.app.downtown.domain.filter.PositionSorting.*
import com.app.downtown.domain.filter.PriceSorting
import com.app.downtown.domain.team.Team
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.infra.repositories.player.PlayerRepository
import com.app.downtown.infra.repositories.httpclient.JsoupClient
import org.jsoup.Jsoup
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class PlayerRepositoryTest {

    @Mock
    private lateinit var jsoupClient: JsoupClient

    private val playerRepository by lazy {
        PlayerRepository(
            jsoupClient = jsoupClient,
            cache = InMemoryCache()
        )
    }

    @Test
    fun `get all players`() {
        // GIVEN
        mockAllTeams()
        val expected = listOf(
            EndPlayer(
                firstName = "DeMar",
                lastName = "DeRozan",
                team = Team.CHICAGO_BULLS,
                number = "11",
                position = Position.POWER_FORWARD,
                average = Average(
                    pointPerMatch = 26.5,
                    reboundPerMatch = 5.0,
                    assistPerMatch = 4.6
                )
            )
        )

        // WHEN
        val actual = playerRepository.getAllEndPlayersForAllTeams()

        // THEN
        assertEquals(expected[0], actual.endPlayers[0])
    }

    @Test
    fun `get all players from cache`() {
        // GIVEN
        mockAllTeams()
        val expected = listOf(
            EndPlayer(
                firstName = "DeMar",
                lastName = "DeRozan",
                team = Team.CHICAGO_BULLS,
                number = "11",
                position = Position.POWER_FORWARD,
                average = Average(
                    pointPerMatch = 26.5,
                    reboundPerMatch = 5.0,
                    assistPerMatch = 4.6
                )
            )
        )

        // WHEN
        playerRepository.getAllEndPlayersForAllTeams()
        val actual = playerRepository.getAllEndPlayersForAllTeams()

        // THEN
        assertEquals(expected[0], actual.endPlayers[0])
    }

    @Test
    fun `filter by position`() {
        // GIVEN
        mockAllTeams()

        // WHEN
        val actual = playerRepository.getPlayersByFilter(
            positionSorting = PositionChoose(Position.POINT_GUARD),
            priceSorting = PriceSorting.Nothing
        )

        // THEN
        assertTrue(actual.endPlayers.all { it.position == Position.POINT_GUARD })
    }

    @Test
    fun `filter by position and price desc`() {
        // GIVEN
        mockAllTeams()

        // WHEN
        val actual = playerRepository.getPlayersByFilter(
            positionSorting = PositionChoose(Position.SMALL_FORWARD),
            priceSorting = PriceSorting.Descending
        )

        // THEN
        assertTrue(actual.endPlayers.all { it.position == Position.SMALL_FORWARD })
        assertEquals(42.699999999999996, actual.endPlayers[0].average.computePrice)
        assertEquals(35.5, actual.endPlayers[1].average.computePrice)
    }

    private fun mockAllTeams() {
        given(jsoupClient.get("https://www.basketball-reference.com/teams/PHI/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/CHI/2022.html")).willReturn(Jsoup.parse(bullsPlayers))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/BRK/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/NYK/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/WAS/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/CLE/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/TOR/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/MIL/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/CHO/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/BOS/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/ATL/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/IND/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/ORL/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/DET/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/UTA/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/GSW/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/DAL/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/PHO/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/LAL/2022.html")).willReturn(Jsoup.parse(lalPlayers))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/MEM/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/SAC/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/DEN/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/LAC/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/POR/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/MIN/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/SAS/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/OKC/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/HOU/2022.html")).willReturn(Jsoup.parse(""""""))
        given(jsoupClient.get("https://www.basketball-reference.com/teams/NOP/2022.html")).willReturn(Jsoup.parse(""""""))
    }
}