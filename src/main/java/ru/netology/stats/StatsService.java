package ru.netology.stats;

public class StatsService {

    public int sumTotalSales(long[] sales) {
        int sumSales = 0;
        for (long s : sales) {
            sumSales += s;
        }
        return sumSales;
    }

    public int averageSales(long[] sales) {
        int average = sumTotalSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                value++;
            }
        }
        return value;
    }

    public int maxAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                value++;
            }
        }
        return value;
    }
}