package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.Holdable;
import com.zipcodewilmington.froilansfarm.Produce;

import java.util.HashMap;

public class Silo<T extends Holdable> {
        static HashMap<Produce,Integer> storage = new HashMap<Produce, Integer>();

        public Silo(Produce produce, Integer integer){
//            storage.put(corn, 0);
//            storage.put(tomato, 0);
//            storage.put(egg, 0);
        }

        public int getProduce(Produce produce){
            return storage.get(produce);
        }

        public static void addProduce(Produce produce){
            Integer count = storage.get(produce);
            storage.put(produce, count + 1);
        }

}
