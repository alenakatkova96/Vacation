package ru.netology.services;

import org.junit.Assert;
import org.junit.Test;
//import ru.netology.services.VacationService;

public class VacationServiceTest {
    @Test

    public void testCalculateCount() {
        VacationService vacationService = new VacationService();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;

        int actual = vacationService.calculateCount(income, expenses, threshold);
        int expected = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCalculateCount2() {
        VacationService vacationService = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = vacationService.calculateCount(income, expenses, threshold);
        int expected = 2;

        Assert.assertEquals(expected, actual);

    }


}
