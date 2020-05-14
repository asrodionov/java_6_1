package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumPurchases() {
        StatsService service = new StatsService();

        long expected = 180;

        long actual = service.calculateSumPurchases(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();

        long expected = 15;

        long actual = service.calculateAverageSum(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void calculateMaxPurchasesMonth() {
        StatsService service = new StatsService();

        long expected = 8;

        long actual = service.calculateMaxPurchasesMonth(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void calculateMinPurchasesMonth() {
        StatsService service = new StatsService();

        long expected = 9;

        long actual = service.calculateMinPurchasesMonth(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void calculateBelowAverageSumMonth() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.calculateBelowAverageSumMonth(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void calculateAboveAverageSumMonth() {
        StatsService service = new StatsService();

        long expected = 5;

        long actual = service.calculateAboveAverageSumMonth(purchases);

        assertEquals(expected, actual);
    }

}