package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackServiceTest {

    @Test
    public void ShouldReturn1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldReturnZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void  ShouldReturn900() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturn700() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1300;
        int expected = 700;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
}