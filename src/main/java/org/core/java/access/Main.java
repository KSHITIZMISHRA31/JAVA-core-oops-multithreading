package org.core.java.access;

public class Main {
    public static void main(String[] args) {

        //this have public accesss modifier
        A al = new A(10,"kshitiz");
        // as name and num are public so we can directly access them
        System.out.println(al.name);
        System.out.println(al.num);

        B bl = new B(11,"vishu");
        //so Protected members are accessible outside the class
        System.out.println(bl.name);
        System.out.println(bl.num);

        C cl = new C(12,"Mishra");
//        getting Error in fetching private members outide the class so to fetch them need getter and setters
//        System.out.println(cl.name);
//        System.out.println(cl.num);

        D dl = new D(13,"Mishraji");
//        getting Error in fetching Default members were treated as private outide the class so to fetch them need getter and setters
//        System.out.println(cl.name);
//        System.out.println(cl.num);


    }
}
