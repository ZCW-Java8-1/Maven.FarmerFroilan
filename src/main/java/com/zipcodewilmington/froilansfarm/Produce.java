package com.zipcodewilmington.froilansfarm;

public abstract class Produce {
    String name;
    public Produce(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
