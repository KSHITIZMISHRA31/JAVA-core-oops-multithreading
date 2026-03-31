package org.core.java.abstact;

public abstract class Parent {
    int age;
    //cannot create static method as static
    public static void greeting(){
        System.out.println("hello everyone in this group");
    }

    public final void admin(){
        System.out.println("hey hows every one");
    }

    abstract public void career();
    abstract public void hobbies();

}
