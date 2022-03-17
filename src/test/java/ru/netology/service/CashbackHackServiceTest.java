package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldWhereAmount0() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWhereAmount999() {
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWhereAmount1000() {
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldWhereAmount1001() {
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

}