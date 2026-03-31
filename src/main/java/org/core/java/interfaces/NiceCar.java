package org.core.java.interfaces;

public class NiceCar {
    private Engine engn;
    private Music mus;

    public NiceCar(Engine engn,Music mus) {
        this.engn = engn;
        this.mus = mus;
    }

    public void start(){
        engn.start();
    }
    public void stop(){
        engn.stop();
    }
    public void accelerate(){
        engn.acc();
    }
    public void startmusic(){
        mus.start();
    }

}
