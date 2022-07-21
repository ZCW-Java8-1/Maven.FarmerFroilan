package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;

public interface Person <Eater> extends NoiseMaker{
    String makeNoise();

    public Eater eat();



}
