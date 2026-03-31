package org.core.java.access;

public class SubClassA extends A{
    public SubClassA(int num, String name) {
        //Public members are accissble from inside the subclass of same packge
        super(num, name);
        this.num = num;
        this.name = name;
    }
}
