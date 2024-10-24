package ru.netology.stats.services;

import java.util.Arrays;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        return Arrays.stream(sales).sum();
    }

    public long averageOfAllSales(long[] sales, long sum) {
        return sum / sales.length;
    }

    public int monthWithMinSales(long[] sales) {
        int minSales = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minSales = i; // запомним его как минимальный
            }
        }
        return minSales + 1;
    }

    public int monthWithMaxSales(long[] sales) {
        int maxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }


    public int salesBeloveAverage(long[] sales, long average) {
        int salesBelovAverage = 0;
        long averageSalesVolume = average;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesVolume) {
                salesBelovAverage++;
            }
        }
        return salesBelovAverage;
    }

    public int salesAboveAverage(long[] sales, long average) {
        int salesAbovAverage = 0;
        long averageSalesVolume = average;
        for (long sale : sales) {
            if (sale > averageSalesVolume) {
                salesAbovAverage++;
            }
        }
        return salesAbovAverage;
    }

}