package org.core.java.access;

public class D {
    int num;
    String name;
    // Default access qualifiers were accessible inside the class itself
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

    public D(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
