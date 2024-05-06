package ru.netology.service;

import static org.testng.Assert.assertEquals;
public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void ShouldReturn1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void ShouldReturnZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public  void  ShouldReturn900() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void ShouldReturn700() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1300;
        int expected = 700;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual,expected);
    }
}