package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void isAnAnimal() {
        //Given
        Chicken chicken = new Chicken();
        //Then
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void fertilizedTest() {
    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        String noise = "Peep!";
        Assert.assertEquals(noise, chicken.makeNoise());

    }
}