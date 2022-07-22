package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Holdable;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {
    public Horse(String name) {
        super(name);
    }

    public Boolean isRiding() {
        return null;
    }

    public Boolean ride() {
        return null;
    }

    public void stopRiding() {

    }
}
