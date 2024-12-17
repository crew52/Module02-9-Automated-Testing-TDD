package org.example;

import java.time.LocalDate;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate nextDate = currentDate.plusDays(1);

        return nextDate.getDayOfMonth() + "/" + nextDate.getMonthValue() + "/" + nextDate.getYear();
    }
}
