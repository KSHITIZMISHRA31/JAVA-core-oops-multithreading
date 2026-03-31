package org.core.java.generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 1;
    private int size = 0;

    CustomGenArrayList(){
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T val){
        if(isfull()){
            resize();
        }
        this.arr[size++] = val;
    }

    private boolean isfull(){
        if(arr.length == size) {
            return true;
        }
        return false;
    }

    private void resize(){
        Object[] temp = new Object[size*2];

        for(int i=0; i<this.arr.length; i++){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public void display(){
        System.out.println("------Array------");
        System.out.print("[");
        for(int i=0; i<this.arr.length;i++){
            System.out.print(this.arr[i]);
            if(i!=this.arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public void delete(){
        System.out.println("Removed value from array --> "+this.arr[size-1]);
        this.arr[--size] = null;
        if(ishalf()){
            reducesize();
        }
    }

    private boolean ishalf() {
        if((arr.length/2) == size) {
            return true;
        }
        return false;
    }

    private void reducesize(){
        Object[] temp = new Object[arr.length/2];

        for(int i=0; i<temp.length; i++){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }







}
