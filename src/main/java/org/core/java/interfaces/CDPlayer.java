package org.core.java.interfaces;

public class CDPlayer implements Music{
    @Override
    public void start() {
        System.out.println("Melody Music started");
    }

    @Override
    public void stop() {
        System.out.println("Music stoped");
    }
}
