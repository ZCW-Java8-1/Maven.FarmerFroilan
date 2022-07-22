package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class Farmer extends Person {


    @Override
    public void makeNoise() {
        System.out.println("Yee haw!");
    }

    public void plants(Crop crop) {
        CropRow.plantCrop(crop);
    }
}
