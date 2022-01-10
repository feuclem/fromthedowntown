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

        val expected = 103.80000000000001
        assertEquals(expected, totalCredit.amount)
    }

    @Test
    fun `increase amount`() {
        val amountToIncrease = jamesHarden.average.computePrice
        val totalCredit = TotalCredit(amount = 103.80000000000001)

        totalCredit.increaseAmount(amountToIncrease)

        val expected = 150.0
        assertEquals(expected, totalCredit.amount)
    }

    @Test
    fun `is transaction possible`() {
        val amountToDecrease = jamesHarden.average.computePrice
        val totalCredit = TotalCredit(amount = 20.0)

        val result = totalCredit.isTransactionPossible(amountToDecrease)

        assertFalse(result)
    }
}