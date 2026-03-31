package org.core.java.lamda;

public class Student implements Comparable<Student>{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int val = (int)(this.marks - o.marks);
        return val;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
