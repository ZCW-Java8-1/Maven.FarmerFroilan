package com.zipcodewilmington.froilansfarm.shelter;

import com.sun.tools.javac.util.List;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class CropRow {

     ArrayList<Crop> cropRow = new ArrayList<Crop>();

     public CropRow(){
          CropRow cropRow = new CropRow();
     }

     public Crop getCrop(int integer) {
          return cropRow.get(integer);
     }
     public int getSize() {
          return cropRow.size();
     }

     public void clearRow(){
          this.cropRow.clear();
     }



}
