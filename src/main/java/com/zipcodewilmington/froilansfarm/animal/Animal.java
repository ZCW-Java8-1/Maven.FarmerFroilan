package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.shelter.Silo;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater, Holdable {

    private String name;
    private ArrayList<Produce> eatenMeals;


    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Produce> getEatenMeals() {
        return eatenMeals;
    }

    public void eat(Produce produce){
        Silo.subtractProduce(produce.toString());
        eatenMeals.add(produce);
    }

}
