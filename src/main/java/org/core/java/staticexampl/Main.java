package org.core.java.staticexampl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Student[] stu = new Student[5];

        // understanding static variable
//        Huaman h = new Huaman("kshitiz",10000,26);
//        Huaman h2 = new Huaman("sumit", 20000, 25);
//        Huaman h3 = new Huaman("sam", 25000, 28);
//
//        System.out.println(Huaman.population);// we can access population with the help of population name
//        System.out.println(h.population); // we can access it like this but this is not recommended

        //calling runnable
        RunnableRepo ru = new RunnableRepo();
        ru.run();

    }



}