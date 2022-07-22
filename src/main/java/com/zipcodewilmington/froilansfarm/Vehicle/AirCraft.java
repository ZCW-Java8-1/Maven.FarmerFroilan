package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;

public class AirCraft extends Vehicle<Pilot> {
    private boolean isFlying = false;

    public boolean fly() {
        this.isFlying = true;
        return isFlying;
    };

    public void makeNoise() {

    }

    public void mounted() {

    }

    public void dismounted() {

    }
}


