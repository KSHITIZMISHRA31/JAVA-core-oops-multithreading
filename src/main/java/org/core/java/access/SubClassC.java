package org.core.java.access;

public class SubClassC extends C{
    public SubClassC(int num, String name) {
        super(num, name);
        //Protected members are not accissble from inside the subclass need getters and setters of same packge
//        this.num = num;
//        this.name = name;
        this.getNum();
        this.setNum(num);
        this.getName();
        this.setName(name);


    }
}
