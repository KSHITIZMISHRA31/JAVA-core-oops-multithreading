package org.core.java.staticexampl;

public class RunnableRepo {
    public void run(){
        StaticBlock st = new StaticBlock();
        System.out.println("Values of static variable : "+StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.a += 3;
        // static variable were initialised when first object is created
        StaticBlock st1 = new StaticBlock();
        System.out.println("Values of static variable : "+StaticBlock.a + " " + StaticBlock.b);

        //we can acces directly inner static class without creating object of outerclass

        StaticBlock.Inerclass inc = new StaticBlock.Inerclass("Kshitiz");
        StaticBlock.Inerclass inc2 = new StaticBlock.Inerclass("Vishu");
        // as only class is static it can be accessed by without outer object
        // but if I but static variable then it will be same for every one
        System.out.println("Value of st for first obj "+inc.st);
        System.out.println("Value of st for second obj "+inc2.st);

    }
}
