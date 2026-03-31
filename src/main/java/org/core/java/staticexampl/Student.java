package org.core.java.staticexampl;

public class Student {

    int rolno;
    String name;
    int marks;

    public int getRolno() {
        return rolno;
    }

    public void setRolno(int rolno) {
        this.rolno = rolno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rolno=" + rolno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
