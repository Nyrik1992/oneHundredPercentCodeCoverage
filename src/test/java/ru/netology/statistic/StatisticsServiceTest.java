package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Максимальный доход за месяц равен " + actual);
    }

    @Test
    void otherValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {35_000, 2_525, 32_558, 654_454, 0, 354_656, 48, 16, 0, 11_754, 54_412};
        long expected = 654_454;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Максимальный доход за месяц равен " + actual);
    }

    @Test
    void negativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, -5, 0, -4, 0, -3, -48, -16, 0, -11, -54_412};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Максимальный доход за месяц равен " + actual);
    }
    @Test
    void mixedValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, -5, 0, -4, 9, 0, -48, -16, 0, -11, 3};
        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
        System.out.println("Максимальный доход за месяц равен " + actual);
    }
}