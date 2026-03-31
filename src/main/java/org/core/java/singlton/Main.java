package org.core.java.singlton;

public class Main {
    public static void main(String[] args) {
        //singleton st1 = new singleton();  we cannot create as constructor is private
        singleton st1 = singleton.getInstance();
        singleton st2 = singleton.getInstance();
        singleton st3 = singleton.getInstance();
        // as we created 3 objects but only onces it callled construcotr
    }

}
