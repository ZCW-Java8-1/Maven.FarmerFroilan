package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Horse extends Animal implements Rideable {

    public Boolean mounted() {

        return null;
    }

    public Boolean dismounted() {

        return null;
    }

    public void eat() {

    }

    public Boolean hasBeenFed() {
        return null;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }
}
