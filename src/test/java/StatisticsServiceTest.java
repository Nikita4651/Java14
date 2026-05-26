package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_NewMaximumFound() {
        ru.netology.statistic.StatisticsService service = new StatisticsService();
        long[] incomes = {5, 10, 8, 15}; // 10 > 5, 15 > 10
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void findMax_MaximumInMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {3, 7, 20, 15, 10}; // максимум в середине
        long expected = 20;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_IncreasingSequence() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5}; // каждый следующий больше предыдущего
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_DecreasingSequence() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 4, 3, 2, 1}; // каждый следующий меньше предыдущего
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_SingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_AllElementsEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }


}