package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Chicken extends Animal implements Produce {


    public Boolean fertilize() {
        return null;
    }

    public Crop plant() {
        return null;
    }

    public void eat() {

    }

    public Boolean hasBeenFed() {
        return null;
    }

@Override
    public String makeNoise() {
        return "Peep!";
    }
}
