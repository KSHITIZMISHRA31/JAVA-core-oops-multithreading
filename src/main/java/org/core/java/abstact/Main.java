package org.core.java.abstact;

public class Main {
    public static void main(String[] args) {

        Son s = new Son(26);
        s.career();
        s.hobbies();

        Daughter d = new Daughter(19);
        d.career();
        d.hobbies();
        //child can access its final function but it cant be overwritten
        d.admin();

        //we cannot create objects of parent class;
//        Parent papa = new Parent() {
//            @Override
//            public void career() {}
//            @Override
//            public void hobbies() {}
//        } showing methods to implemen
        Parent.greeting();//fetchdby class name only


    }
}
