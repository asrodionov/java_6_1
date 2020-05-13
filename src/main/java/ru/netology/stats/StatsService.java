package ru.netology.stats;

public class StatsService {
    public long calculateSumPurchases(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
    public long calculateAverageSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum / 12;
    }
    public long calculateMaxPurchasesMonth(long[] purchases) {
        long max = 0;
        int i = 1;
        int n = 1;
        for (long purchase : purchases) {
            if (purchase >= max) {
                max = purchase;
                n = i;
            }
        i = i + 1;
        }
        return n;
    }
    public long calculateMinPurchasesMonth(long[] purchases) {
        long min = purchases[1];
        int i = 1;
        int n = 1;
        for (long purchase : purchases) {
            if (purchase <= min) {
                min = purchase;
                n = i;
            }
            i = i + 1;
        }
        return n;
    }
    public long calculateBelowAverageSumMonth(long[] purchases, long av) {
        int n = 0;
        for (long purchase : purchases) {
            if (purchase < av) {
                n = n + 1;
            }
        }
        return n;
    }
    public long calculateAboveAverageSumMonth(long[] purchases, long av) {
        int n = 0;
        for (long purchase : purchases) {
            if (purchase > av) {
                n = n + 1;
            }
        }
        return n;
    }
}
