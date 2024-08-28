package ru.netology.stats;

public class StatsService {

    public int sumTotalSales(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales += s;
        }
        return sumSales;
    }

    public int averageSales(int[] sales) {
        int average = sumTotalSales(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSales(int[] sales) {
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                value++;
            }
        }
        return value;
    }

    public int maxAverageSales(int[] sales) {
        int value = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                value++;
            }
        }
        return value;
    }
}