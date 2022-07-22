package com.zipcodewilmington.froilansfarm;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

public class MondayTest {

    @BeforeTest
//    Farm farm = new Farm();

    @Test
    public void feedHorsesTest() {
//        Assert.assertTrue(Stable.getHorse(0).hasBeenFed());
    }
    @Test
    public void rideHorsesTest() {
//        Assert.assertTrue(Stable.getHorse(0).hasBeenRidden());
    }
    @Test
    public void breakfastFroilanTest() {
//        Assert.assertEquals("1 EarCorn, 2 Tomato, 5 Egg", FarmHouse.getPerson(0).mealsEaten().toString);
    }
    @Test
    public void breakfastFroilandaTest() {
//        Assert.assertEquals("2 EarCorn, 1 Tomato, 2 Egg", FarmHouse.getPerson(1).mealsEaten().toString);
    }
}
