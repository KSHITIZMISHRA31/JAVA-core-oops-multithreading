package org.core.java.multithreading;

public class CounterVal extends Thread{

    private int counter;
    // this sync key word allows one thread to assecc this function at one time
    public synchronized void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }

}
