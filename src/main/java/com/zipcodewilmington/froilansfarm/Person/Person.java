package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {

    String name;
    int age;
    boolean hasBeenFed;

    public Person (String name, int age, boolean hasBeenFed){
        this. name = name;
        this.age = age;
        this.hasBeenFed = hasBeenFed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasBeenFed() {
        return hasBeenFed;
    }

    public void setHasBeenFed(boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
    }
}
