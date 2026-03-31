package org.core.java.access;

import java.util.Arrays;

public class A {
    public int num;
    public String name;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }
    // public access qualifiers were accessible inside the class itself
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
