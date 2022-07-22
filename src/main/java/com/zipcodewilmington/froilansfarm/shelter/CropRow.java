package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.Holdable;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import java.util.ArrayList;

public class CropRow extends Shelter {

     static ArrayList<Crop> cropRow = new ArrayList<Crop>();

     public CropRow(){
          CropRow cropRow = new CropRow();
     }

     public Crop getObject(int integer) {
          return cropRow.get(integer);
     }
     public int getSize() {
          return cropRow.size();
     }

     public void clear(){
          this.cropRow.clear();
     }

     public static void add(Crop crop){
          cropRow.add(crop);
     }
}
