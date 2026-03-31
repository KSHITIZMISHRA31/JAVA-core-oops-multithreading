package org.core.java.interfaces;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.acc();
        c1.brk();
        //in this we can ony fetch one function which are same in both the interface


        // in this exaple we can have option to choose engines as well as we have option to
        // do multiple inheritance,
        NiceCar nc = new NiceCar(new PowerIngine(),new CDPlayer());
        NiceCar nc1 = new NiceCar(new ElectricEngine(),new CDPlayer());

        nc.start();
        nc.accelerate();
        nc.startmusic();
        nc.stop();

        nc1.start();
        nc1.accelerate();
        nc1.startmusic();
        nc1.stop();


    }
}
