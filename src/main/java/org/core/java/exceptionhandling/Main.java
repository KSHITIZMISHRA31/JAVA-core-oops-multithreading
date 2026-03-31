package org.core.java.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // gives error error
        //int c = a/b;

        try{
            int c = devide(a,b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will run no matters");
        }

    }

    public static int devide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please make sure b greater then zero"); // this allows contoumized message
        }
        return a/b;
    }
}
