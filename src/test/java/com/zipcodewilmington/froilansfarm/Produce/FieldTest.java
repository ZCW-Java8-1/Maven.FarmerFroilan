package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.GenericUtils.Edible;
import org.junit.Test;

public class FieldTest {

    @Test
    Crop<Edible> mater = new Crop<Edible>() {
        public Crop plant(Edible object) {
            return object;
        }
    };
    CropRow<Crop> cropRow = new CropRow<Crop>(1,mater);
    Field<CropRow> fieldsy = new Field<CropRow>(1, cropRow);

}
