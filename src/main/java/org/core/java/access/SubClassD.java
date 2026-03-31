package org.core.java.access;

public class SubClassD extends D{
    public SubClassD(int num, String name) {
        //Default members are accissble from inside the subclass of same packge
        super(num, name);
        this.num = num;
        this.name = name;
    }
}
