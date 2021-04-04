package com.app.downtown.domain

import com.app.downtown.domain.PlayerDummy.donovanMitchell
import com.app.downtown.domain.PlayerDummy.jamesHarden
import com.app.downtown.domain.PlayerDummy.joelEmbiid
import com.app.downtown.domain.PlayerDummy.juliusRandle
import com.app.downtown.domain.PlayerDummy.lameloBall
import com.app.downtown.domain.PlayerDummy.luguentzDort
import com.app.downtown.domain.PlayerDummy.nikolaJokic
import com.app.downtown.domain.PlayerDummy.players
import com.app.downtown.domain.PlayerDummy.rudyGobert
import com.app.downtown.domain.PlayerDummy.stephenCurry
import com.app.downtown.domain.PlayerDummy.tobiasHarris
import com.app.downtown.domain.PlayerDummy.tylerHerro
import com.app.downtown.domain.PlayerDummy.zionWilliamson
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

        val expected = listOf(joelEmbiid, rudyGobert, nikolaJokic)
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

        val result = players.filterWithPriceInferiorAt(25.0)

        val expected = listOf(tylerHerro, luguentzDort)
        assertEquals(expected, result)
    }

    @Test
    fun `filter by ascending price`() {
        val players = Players(players = players)

        val result = players.filterByAscendingPrice()

        val expected = listOf(
            luguentzDort,
            tylerHerro,
            lameloBall,
            rudyGobert,
            tobiasHarris,
            donovanMitchell,
            zionWilliamson,
            juliusRandle,
            stephenCurry,
            joelEmbiid,
            nikolaJokic,
            jamesHarden
        )
        assertEquals(expected, result)
    }

    @Test
    fun `filter by descending price`() {
        val players = Players(players = players)

        val result = players.filterByDescendingPrice()

        val expected = listOf(
            jamesHarden,
            nikolaJokic,
            joelEmbiid,
            stephenCurry,
            juliusRandle,
            zionWilliamson,
            donovanMitchell,
            tobiasHarris,
            rudyGobert,
            lameloBall,
            tylerHerro,
            luguentzDort
        )
        assertEquals(expected, result)
    }
}