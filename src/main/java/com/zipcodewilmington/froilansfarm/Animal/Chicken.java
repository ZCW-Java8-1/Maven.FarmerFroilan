package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public class Chicken <ChickenType> extends Animal {

    public Chicken(Integer id, Integer age, Boolean hasBeenFed){
        super(id, age, hasBeenFed);
    }
    public void yield() {

    }

    public void eat() {

    }

    public String makeNoise() {
        return "Peep!";
    }
}
