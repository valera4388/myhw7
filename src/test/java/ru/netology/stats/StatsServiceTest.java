package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSumTotalSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumTotalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.minAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.maxAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
