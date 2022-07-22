package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Produce;

public class Egg extends Produce {
    private boolean hasBeenFertilized;

    public Egg() {
        super("egg");
        this.hasBeenFertilized = false;
    }

    public String toString(){
        return super.toString();
    }


}
