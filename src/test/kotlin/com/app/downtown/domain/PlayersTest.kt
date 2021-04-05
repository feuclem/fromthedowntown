package com.app.downtown.domain

import com.app.downtown.PlayerDummy.aaronHoliday
import com.app.downtown.PlayerDummy.donovanMitchell
import com.app.downtown.PlayerDummy.garrisonMathews
import com.app.downtown.PlayerDummy.grantWilliams
import com.app.downtown.PlayerDummy.isaiahStewart
import com.app.downtown.PlayerDummy.jakobPoeltl
import com.app.downtown.PlayerDummy.jamesHarden
import com.app.downtown.PlayerDummy.joelEmbiid
import com.app.downtown.PlayerDummy.juliusRandle
import com.app.downtown.PlayerDummy.karlAntonyTowns
import com.app.downtown.PlayerDummy.lamarcusAldridge
import com.app.downtown.PlayerDummy.lameloBall
import com.app.downtown.PlayerDummy.luguentzDort
import com.app.downtown.PlayerDummy.nikolaJokic
import com.app.downtown.PlayerDummy.players
import com.app.downtown.PlayerDummy.rudyGobert
import com.app.downtown.PlayerDummy.stephenCurry
import com.app.downtown.PlayerDummy.tobiasHarris
import com.app.downtown.PlayerDummy.tylerHerro
import com.app.downtown.PlayerDummy.zionWilliamson
import com.app.downtown.domain.Position.CENTER
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlayersTest {

    @Test
    fun `filter by name`() {
        val players = Players(players = players)

        val result = players.filterByName("en")

        val expected = listOf(jamesHarden, stephenCurry, luguentzDort)
        assertEquals(expected, result)
    }

    @Test
    fun `filter by position`() {
        val players = Players(players = players)

        val result = players.filterByPosition(CENTER)

        val expected = listOf(joelEmbiid, rudyGobert, nikolaJokic, karlAntonyTowns, jakobPoeltl, lamarcusAldridge)
        assertEquals(expected, result)
    }

    @Test
    fun `filter with price superior at 45`() {
        val players = Players(players = players)

        val result = players.filterWithPriceSuperiorAt(45.0)

        val expected = listOf(jamesHarden, nikolaJokic)
        assertEquals(expected, result)
    }

    @Test
    fun `filter with price inferior at 25`() {
        val players = Players(players = players)

        val result = players.filterWithPriceInferiorAt(20.0)

        val expected = listOf(luguentzDort, jakobPoeltl, garrisonMathews, grantWilliams, aaronHoliday, isaiahStewart, lamarcusAldridge)
        assertEquals(expected, result)
    }

    @Test
    fun `filter by ascending price`() {
        val players = Players(players = players)

        val result = players.filterByAscendingPrice()

        val expected = listOf(
            garrisonMathews,
            grantWilliams,
            aaronHoliday
        )
        assertEquals(expected, result.subList(0, 3))
    }

    @Test
    fun `filter by descending price`() {
        val players = Players(players = players)

        val result = players.filterByDescendingPrice()

        val expected = listOf(
            jamesHarden,
            nikolaJokic,
            joelEmbiid
        )
        assertEquals(expected, result.subList(0, 3))
    }
}