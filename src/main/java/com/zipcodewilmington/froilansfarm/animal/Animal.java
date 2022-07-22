package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Food;
import com.zipcodewilmington.froilansfarm.Holdable;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater, Holdable {

    private String name;
    private ArrayList<Food> eatenMeals;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Food> getEatenMeals() {
        return eatenMeals;
    }

}
