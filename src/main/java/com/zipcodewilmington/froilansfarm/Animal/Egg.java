package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

public class Egg extends Chicken implements Produce {
    @Override
    public Crop plant() {
        return null;
    }

    @Override
    public Boolean fertilize() {
        return null;
    }
}
