package com.zipcodewilmington.froilansfarm;

import java.util.concurrent.BlockingQueue;

public interface Rideable {

    public Boolean isRiding();

    public Boolean ride();

    public void stopRiding();

}
