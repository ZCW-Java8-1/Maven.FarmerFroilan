package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.shelter.Silo;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements NoiseMaker, Eater {
    //Person can makeNoise and can eat an Edible object.
    //Farmer is an Eater, a Rider, a Botanist, and a Person.
    //FarmHouse stores many Person
    //Froilan, a Farmer has a Farm consisting of
        //1 Field of 5 CropRow.
            //Row 1 has Corn
            //Row 2 has Tomato
            //Row 3 and beyond grows arbitrary vegetation.
        //15 Chicken across 4 ChickenCoop
        //10 Horse across 3 Stable.
        //2 FarmVehicle
        //1 Aircraft

    List<Produce> stomach = new ArrayList<Produce>();

    public void mounts (Rideable rideable) {
        rideable.isRiding();
    }

    public void dismounts() {

    }

    public void eat(Produce produce){
        //deduct from the storage.
        Silo.subtractProduce(produce.toString());
        stomach.add(produce);

    }
}
