package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.GenericUtils.Eater;
import com.zipcodewilmington.froilansfarm.GenericUtils.NoiseMaker;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rideable;
import com.zipcodewilmington.froilansfarm.GenericUtils.Rider;

public class Farmer <Person, Botanist>  implements Rider  {
    public Boolean mount() {

        return null;
    }





    public Boolean dismount() {
        return null;
    }


    //Got a warning from the IDE about using raw types and awareness of type erasure when I did
    // public class Farmer <Farmer extends Person> {}.


}
