package org.core.java.abstact;

public class Son extends Parent{
    public Son(int age) {
        this.age = age;
    }

    @Override
    public void career() {
        System.out.println("I want to become Engineer");
    }

    @Override
    public void hobbies() {
        System.out.println("I love skiing");
    }

}
