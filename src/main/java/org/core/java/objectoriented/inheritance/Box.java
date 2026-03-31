package org.core.java.objectoriented.inheritance;

public class Box {
    int l;
    int w;
    int h;
    //int weight;

    Box(){
        this.l = 0;
        this.w = 0;
        this.h = 0;
    }
    Box(int a){
        this.l = a;
        this.w = a;
        this.h = a;
    }
    Box(int a,int b,int c){
        this.l = a;
        this.w = b;
        this.h = c;
    }
    Box(Box that){
        this.l = that.l;
        this.w = that.w;
        this.h = that.h;
    }

    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}
