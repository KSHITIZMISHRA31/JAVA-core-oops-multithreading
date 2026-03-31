package org.core.java.generics;

public class Main {

    public static void main(String[] args) {
        CustomArrayList cr1 = new CustomArrayList();

        cr1.add(5);
        cr1.add(10);
        cr1.add(15);
        cr1.add(12);
        cr1.add(3);
        cr1.add(2);
        cr1.add(51);
        cr1.add(101);
        cr1.add(21);
        cr1.display();
        cr1.delete();
        cr1.display();

        System.out.println("-Generic array-");
        CustomGenArrayList<String> cr2 = new CustomGenArrayList<>();

        cr2.add("Kshitiz");
        cr2.add("Mishra");

        cr2.display();
        cr2.delete();
        cr2.display();

    }
}



