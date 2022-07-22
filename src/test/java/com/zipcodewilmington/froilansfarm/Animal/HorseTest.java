package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {


    @Test
    public void isAnAnimalTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }
    @Test
    public void mounted() {
    }

    @Test
    public void dismounted() {
    }
}