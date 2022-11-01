package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService sum = new StatsService();

        int expectedSum = 180;

        int actualSum = sum.getSum(stats);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateAverage() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService average = new StatsService();

        int expectedAverage = 15;

        int actualAverage = average.getAverage(stats);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldCalculateLowesSellsMonth() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService lowestSellsMonth = new StatsService();

        int expectedLowestSellsMonth = 8;

        int actualLowestSellsMonth = lowestSellsMonth.getLowestSellsMonth(stats);

        Assertions.assertEquals(expectedLowestSellsMonth, actualLowestSellsMonth);

    }

    @Test
    public void shouldCalculateHighestSellsMonth() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService highestSellsMonth = new StatsService();

        int expectedHighestSellsMonth = 7;
        int actualHighestSellsMonth = highestSellsMonth.getHighestSells(stats);

        Assertions.assertEquals(expectedHighestSellsMonth, actualHighestSellsMonth);
    }

    @Test
    public void shouldCalculateLowerThanAverage() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService lowerThanAverage = new StatsService();

        int expectedLowerThanAverage = 5;
        int actualLowerThanAverage = lowerThanAverage.getLowerThanAverage(stats);

        Assertions.assertEquals(expectedLowerThanAverage, actualLowerThanAverage);
    }

    @Test
    public void shouldCalculateHigherThanAverage() {

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService higherThanAverage = new StatsService();

        int expectedHigherThanAverage = 5;
        int actualHigherThanAverage = higherThanAverage.getHigherThanAverage(stats);

        Assertions.assertEquals(expectedHigherThanAverage, actualHigherThanAverage);
    }
}