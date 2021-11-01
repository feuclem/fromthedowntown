package com.app.downtown.domain

import com.app.downtown.PlayerDummy.jamesHarden
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TotalCreditTest {

    @Test
    fun `decrease amount`() {
        val amountToDecrease = jamesHarden.average.computePrice
        val totalCredit = TotalCredit()

        totalCredit.decreaseAmount(amountToDecrease)

        val expected = 203.8
        assertEquals(expected, totalCredit.get)
    }

    @Test
    fun `increase amount`() {
        val amountToIncrease = jamesHarden.average.computePrice
        val totalCredit = TotalCredit(amount = 203.8)

        totalCredit.increaseAmount(amountToIncrease)

        val expected = 250.0
        assertEquals(expected, totalCredit.get)
    }

    @Test
    fun `is transaction possible`() {
        val amountToDecrease = jamesHarden.average.computePrice
        val totalCredit = TotalCredit(amount = 20.0)

        val result = totalCredit.isTransactionPossible(amountToDecrease)

        assertFalse(result)
    }
}