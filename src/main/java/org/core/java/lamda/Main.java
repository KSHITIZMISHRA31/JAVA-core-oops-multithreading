package org.core.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kshitiz = new Student(101,90);
        Student ramesh = new Student(102,93);
        Student amit = new Student(103,99);
        Student om = new Student(104,45);
        Student jai = new Student(105,77);
        Student veru = new Student(106,98);
//        if(Kshitiz > Ramesh)//this get confused what we have to comare here

        Student[] list = {kshitiz,ramesh,amit,om,jai,veru};
        // it sorting because I have added to compare method in my class otherwise it will give error
        //Arrays.sort(list);
        //we can also do this comparison by adding new comparator in this
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.marks-o2.marks;
//            }
//        });

//      this can also be done by lamda function
        Arrays.sort(list, (o1, o2) -> o1.marks - o2.marks);


        System.out.println(Arrays.toString(list));


//        if(kshitiz.compareTo(ramesh)<0){
//            System.out.println("rameshs have more marks");
//        }



        LamdaSum sb = (x,y)-> x+y;

        LamdaSum pro = (x,y)-> x*y;




    }
}

