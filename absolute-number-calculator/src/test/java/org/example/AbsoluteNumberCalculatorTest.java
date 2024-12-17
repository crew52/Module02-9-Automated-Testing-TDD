package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsoluteNumber() {
        assertEquals(0, AbsoluteNumberCalculator.findAbsolute(0));
    }

    @Test
    void testFindAbsolute1() {
        assertEquals(1, AbsoluteNumberCalculator.findAbsolute(1));
    }

    @Test
    void testFindAbsoluteNegative1() {
        assertEquals(1, AbsoluteNumberCalculator.findAbsolute(-1));
    }
}