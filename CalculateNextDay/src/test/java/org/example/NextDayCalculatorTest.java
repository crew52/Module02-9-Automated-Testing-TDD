package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test case 1/1/2018 -> 2/1/2018")
    void testNextDay_Case1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test case 31/1/2018 -> 1/2/2018")
    void testNextDay_Case2() {
        int day = 31, month = 1, year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 30/4/2018 -> 1/5/2018")
    void testNextDay_Case3() {
        int day = 30, month = 4, year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 28/2/2018 -> 1/3/2018")
    void testNextDay_Case4() {
        int day = 28, month = 2, year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 29/2/2020 -> 1/3/2020")
    void testNextDay_Case5() {
        int day = 29, month = 2, year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 31/12/2018 -> 1/1/2019")
    void testNextDay_Case6() {
        int day = 31, month = 12, year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }
}