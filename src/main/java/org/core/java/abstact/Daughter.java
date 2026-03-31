package org.core.java.abstact;

public class Daughter extends Parent {

    public Daughter(int age) {
        this.age = age;
    }

    @Override
    public void career() {
        System.out.println("I want to become Doctor");
    }

    @Override
    public void hobbies() {
        System.out.println("I love sleeping");
    }
}
