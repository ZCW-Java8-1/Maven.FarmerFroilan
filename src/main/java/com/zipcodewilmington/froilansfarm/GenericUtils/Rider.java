package com.zipcodewilmington.froilansfarm.GenericUtils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.Person.Person;

public interface Rider <RiderType extends Person> {
    Boolean mount();
    Boolean dismount();
}
