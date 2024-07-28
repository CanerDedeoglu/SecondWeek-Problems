package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MathOperationsTest {

    @Test
    fun testTypeControlWithInt() {
        val input = "42"
        val result = typeControl(input)
        assertTrue(result is Int)
        assertEquals(42, result)
    }

    @Test
    fun testTypeControlWithDouble() {
        val input = "42.0"
        val result = typeControl(input)
        assertTrue(result is Double)
        assertEquals(42.0, result)
    }

    @Test
    fun testTypeControlWithInvalidInput() {
        val input = "invalid"
        val result = typeControl(input)
        assertNull(result)
    }

    @Test
    fun testAddNumberWithInts() {
        val num1: Number = 10
        val num2: Number = 20
        val result = addNumber(num1, num2)
        assertTrue(result is Int)
        assertEquals(30, result)
    }

    @Test
    fun testAddNumberWithDoubles() {
        val num1: Number = 10.5
        val num2: Number = 20.5
        val result = addNumber(num1, num2)
        assertTrue(result is Double)
        assertEquals(31.0, result)
    }

    @Test
    fun testSubtractNumberWithInts() {
        val num1: Number = 20
        val num2: Number = 10
        val result = subtractNumber(num1, num2)
        assertTrue(result is Int)
        assertEquals(10, result)
    }

    @Test
    fun testSubtractNumberWithDoubles() {
        val num1: Number = 20.5
        val num2: Number = 10.5
        val result = subtractNumber(num1, num2)
        assertTrue(result is Double)
        assertEquals(10.0, result)
    }

    @Test
    fun testMultiplyNumberWithInts() {
        val num1: Number = 10
        val num2: Number = 20
        val result = multiplyNumber(num1, num2)
        assertTrue(result is Int)
        assertEquals(200, result)
    }

    @Test
    fun testMultiplyNumberWithDoubles() {
        val num1: Number = 10.5
        val num2: Number = 2.0
        val result = multiplyNumber(num1, num2)
        assertTrue(result is Double)
        assertEquals(21.0, result)
    }

    @Test
    fun testDivideNumberWithInts() {
        val num1: Number = 20
        val num2: Number = 10
        val result = divideNumber(num1, num2)
        assertTrue(result is Double)
        assertEquals(2.0, result)
    }

    @Test
    fun testDivideNumberWithDoubles() {
        val num1: Number = 20.5
        val num2: Number = 10.0
        val result = divideNumber(num1, num2)
        assertTrue(result is Double)
        assertEquals(2.05, result)
    }

    @Test
    fun testDivideByZero() {
        val num1: Number = 20
        val num2: Number = 0
        val result = divideNumber(num1, num2)
        assertEquals(0, result)
    }
}
