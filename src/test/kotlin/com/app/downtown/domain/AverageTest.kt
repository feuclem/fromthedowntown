package com.app.downtown.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AverageTest {

    @Test
    fun `compute price`() {
        val average = Average(30.0, 10.0, 10.0)

        val result = average.computePrice

        val expected = 50.0
        assertEquals(expected, result)
    }
}