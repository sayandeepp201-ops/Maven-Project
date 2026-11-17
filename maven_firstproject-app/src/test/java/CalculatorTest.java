package com.maven_firstproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(4, calc.divide(8, 2));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}