package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.shelter.Farm;
import com.zipcodewilmington.froilansfarm.shelter.Silo;

public class Tractor extends Vehicle implements FarmVehicle{

    CropRow cropRow;

    public Tractor(String name) {
        super(name);
    }

    public void operate(Farm farm) {

    }

    public int harvest(CropRow cropRow){
        for(int i = 0; i < cropRow.getSize(); i++){
            Silo.addProduce(cropRow.getObject(i).toString());
        }
        cropRow.clear();

        return 0;
    }


    public void makeNoise(){
        System.out.println("B-b-brruummm");
    }

    public void isRiding(){

    }

    public void stopRiding() {

    }
}
