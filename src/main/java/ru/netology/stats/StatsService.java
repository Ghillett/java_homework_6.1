package ru.netology.stats;

public class StatsService {

    public int getSum(int[] stats) {

        int sum = 0;

        for (int i = 0; i < stats.length; i++) {
            sum += stats[i];
        }

        return sum;
    }

    public int getAverage(int[] stats) {

        return getSum(stats) / stats.length;
    }

    public int getHighestSells(int[] stats) {

        int highestSells = stats[0];

        int temp = -1;

        for (int i = 0; i < stats.length; i++) {
            if (highestSells <= stats[i]) {
                highestSells = stats[i];
                temp = i;
            }
        }

        return temp;
    }

    public int getLowestSellsMonth(int[] stats) {

        int lowestSells = stats[0];

        int temp = -1;

        for (int i = 0; i < stats.length; i++) {
            if (lowestSells >= stats[i]) {
                lowestSells = stats[i];
                temp = i;
            }
        }

        return temp;
    }

    public int getLowerThanAverage(int[] stats) {

        int compare = getAverage(stats);

        int lowerThanAverage = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] < compare) {
                lowerThanAverage++;
            }
        }

        return lowerThanAverage;
    }

    public int getHigherThanAverage(int[] stats) {

        int compare = getAverage(stats);

        int higherThanAverage = 0;

        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > compare) {
                higherThanAverage++;
            }
        }

        return higherThanAverage;
    }
}