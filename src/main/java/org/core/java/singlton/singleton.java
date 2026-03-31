package org.core.java.singlton;

public class singleton {
     // for singleton class we need only its one instance is created 2nd not allowed
     // so we will make its constructor private
    private singleton(){
        System.out.println("Object created");
    }

    private static singleton instance;

    public static singleton getInstance(){
        System.out.println("Hello");
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }

}
