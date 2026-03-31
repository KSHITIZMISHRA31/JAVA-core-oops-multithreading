package org.core.java.multithreading;

public class ThreadClass extends Thread{
    CounterVal c;

    public ThreadClass(CounterVal c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}
