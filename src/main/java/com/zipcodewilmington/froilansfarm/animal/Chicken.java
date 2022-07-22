package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void eat(Produce produce) {

    }

    @Override
    public void makeNoise() {
        System.out.println("bok bok B O K!!");

    }
}
