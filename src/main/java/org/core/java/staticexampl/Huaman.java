package org.core.java.staticexampl;

public class Huaman {
    String name;
    int salary;
    int age;
    static int population;

    public Huaman(){}

    public Huaman(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        population +=1;
    }

    public static void callgreeting(){
        //we cannot call greeting directly inside static method
        Huaman h1 = new Huaman();
        h1.greeting(); // now error is resolved

        //we can call and use static member and variable inside static function
        //as static member dont require any object
    }

    public static void greeting2(){
        System.out.println("Hello Hi how are you");
    }

    public void greeting(){
        System.out.println("Hello Hi how are you");
    }

}
