package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Produce.Crop;

public class Botanist <PersonType> implements Crop {

    Crop crop;
    @Override
    public Crop plant(Object object) {
        return crop;
    }
}