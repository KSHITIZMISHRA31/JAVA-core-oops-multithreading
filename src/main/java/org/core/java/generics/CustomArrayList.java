package org.core.java.generics;

public class CustomArrayList {
    private int[] arr;
    private static int DEFAULT_SIZE = 1;
    private int size = 0;

    CustomArrayList(){
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int val){
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
        int[] temp = new int[size*2];

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
        this.arr[--size] = 0;
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
        int[] temp = new int[arr.length/2];

        for(int i=0; i<temp.length; i++){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }







}
