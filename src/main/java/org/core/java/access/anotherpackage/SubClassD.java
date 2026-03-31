package org.core.java.access.anotherpackage;

import org.core.java.access.D;

public class SubClassD extends D {
    public SubClassD(int num, String name) {
        //Default members are not accissble from inside the subclass of different packge
        super(num, name);
//        this.num = num;
//        this.name = name;
        this.getNum();
        this.setNum(num);
        this.getName();
        this.setName(name);
    }
}
