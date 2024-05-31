package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    public void sumSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void averageSumTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void belowAvarageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAvarage(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void higherAvarageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.higherAvarage(sales);
        assertEquals(expected, actual);
    }
}
