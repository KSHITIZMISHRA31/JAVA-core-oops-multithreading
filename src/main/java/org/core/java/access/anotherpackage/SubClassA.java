package org.core.java.access.anotherpackage;

import org.core.java.access.A;

public class SubClassA extends A {
    public SubClassA(int num, String name) {
        //Public members are accissble from inside the subclass of Different packge
        super(num, name);
        this.num = num;
        this.name = name;
    }
}
