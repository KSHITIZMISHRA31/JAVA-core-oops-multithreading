package org.core.java.objectoriented.inheritance;

public class Boxweight extends Box{
    int weight;

    Boxweight(){
        this.weight = -1;
    }
    Boxweight(int a){
        this.weight = a;
    }
    Boxweight(int a,int b,int c,int d){
        super(a,b,c);
        //super.weight = d; // this will refer to the parent class weight
        this.weight = d;
    }

    @Override
    public String toString() {
        return "Boxweight{" +
                "weight=" + weight +
                ", l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}
