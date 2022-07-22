package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelter.Farm;

public class Tractor extends Vehicle implements FarmVehicle{

    public Tractor(String name) {
        super(name);
    }

    public void operate(Farm farm) {

    }

    public int harvest(Crop crop){
        return 0;
    }
}
