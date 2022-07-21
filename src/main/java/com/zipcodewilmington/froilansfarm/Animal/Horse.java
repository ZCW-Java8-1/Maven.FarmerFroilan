package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Horse <HorseType extends Rider> extends Animal{

    public Horse(Integer id, Integer age, Boolean hasBeenFed){
        super(id, age, hasBeenFed);
    }

    public void eat() {

    }

    public String makeNoise() {
        return "Neigh!";
    }
}
