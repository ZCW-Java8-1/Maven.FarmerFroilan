package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Boolean ride() {
        return null;
    }
}
