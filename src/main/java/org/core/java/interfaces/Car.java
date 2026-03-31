package org.core.java.interfaces;

public class Car implements Engine,Break,Music{

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brk() {
        System.out.println("I break like a normal car");
    }
}
