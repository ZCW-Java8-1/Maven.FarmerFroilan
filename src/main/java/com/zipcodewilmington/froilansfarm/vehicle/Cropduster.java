package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.Farm;

public class Cropduster extends Aircraft implements FarmVehicle {

    public Cropduster(String name) {
        super(name);
    }

    public void operate(Farm farm) {

    }

    public void fertilize(CropRow cropRow){
        if (fly() == true){
            fertilize(cropRow);
        }

    }

    public String makeNoise(){
        return makeNoise();
    }

    public Boolean isRiding(){
        return null;
    }

    public void stopRiding() {

    }
}
