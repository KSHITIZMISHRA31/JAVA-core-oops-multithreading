package org.core.java.access.anotherpackage;

import org.core.java.access.B;

public class SubClassB extends B {
    public SubClassB(int num, String name) {
        //protected members are accissble from inside the subclass of different packge
        super(num, name);
        this.num = num;
        this.name = name;
    }
}
