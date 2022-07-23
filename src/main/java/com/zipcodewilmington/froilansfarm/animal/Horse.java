package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Holdable;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean hasBeenRidden;

    public Horse(String name) {
        super(name);
        this.hasBeenRidden = false;
    }

    public void isRiding() {
        this.hasBeenRidden = true;
    }


    @Override
    public void eat(Produce produce) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Neeeeeeee!");

    }
}
