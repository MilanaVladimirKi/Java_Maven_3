package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }
    public long averageSum(long[] sales) {
        return sumSales(sales) / sales.length;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int belowAvarage(long[] sales) {
        int count = 0;
        long averageSale = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                count++;
            }
        }
        return count;
    }
    public int higherAvarage(long[] sales) {
        int count = 0;
        long averageSale = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                count++;
            }
        }
        return count;
    }
}
