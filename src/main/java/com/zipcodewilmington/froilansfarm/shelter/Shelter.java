package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.Holdable;

import java.util.ArrayList;

public abstract class Shelter implements Holdable {
    static ArrayList<Holdable> shelter = new ArrayList<Holdable>();
    public void clear() {
        this.shelter.clear();
    }

    public int getSize() {
        return this.shelter.size();
    }

    public void add(Holdable object) {
        this.shelter.add(object);
    }

    public Holdable getObject(int integer){
        return this.shelter.get(integer);
    }
}
