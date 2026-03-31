package org.core.java.multithreading;

public class MultithreadEx extends Thread{
    @Override
    public void run() {
        for(; ;){
            System.out.println("World");
        }
    }
}
