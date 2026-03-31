package org.core.java.objectoriented.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box B1 = new Box();
//        System.out.println(B1.toString());
//        Box B2 = new Box(5);
//        System.out.println(B2.toString());
//        Box B3 = new Box(5,6,17);
//        System.out.println(B3.toString());
//        Boxweight Bx1 = new Boxweight();// this call constructor of base class
//        System.out.println(Bx1.toString());
//        Boxweight Bx2 = new Boxweight(5,2,7,8);// this call constructor of base class
//        System.out.println(Bx2.toString());
//
//        Box B4 = new Boxweight(1,2,3,4);
//        //System.out.println(B4.weight); // Here we cannot fetch values of Child class from the parents object even it was refrering

    // Example of Overridding
        Square sq = new Square();
        sq.area();

        Shape sq1 = new Square();
        sq1.area();  // this method was fetchd of child
        sq1.sides(); // as this was fetched from parent
        //as area is overridden so it depends on object


    }
}
