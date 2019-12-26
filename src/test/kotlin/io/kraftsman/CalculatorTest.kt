package io.kraftsman

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {
    @Test
    fun shouldReturnTwoWhenOneAddOne() {
        val target = Calculator()

        assertEquals(2, target.add(1, 1))
    }
}