package org.core.java.access;

public class SubClassB extends B{
    public SubClassB(int num, String name) {
        //protected members are accissble from inside the subclass of same packge
        super(num, name);
        this.num = num;
        this.name = name;
    }
}
