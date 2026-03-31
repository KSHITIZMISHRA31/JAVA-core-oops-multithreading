package org.core.java.multithreading;

public class Main {
    public static void main(String[] args) {
        /*
        MultithreadEx ml = new MultithreadEx();
        ml.start(); //here we have start method to execute;
        // we can directly extends thread class and just create class object and do start

        // this is doe using runable interface
        InterfaceImplRunable im = new InterfaceImplRunable();
        Thread th = new Thread(im);
        th.run();// we have run method
        th.setPriority(Thread.MIN_PRIORITY);
        for(; ;){
            System.out.println("Helo");
        } */
        // noramly this is unrelaible and counter value is reported as no 2000
        // value of counter is fetched by both threads at same time
        CounterVal counter = new CounterVal();
        ThreadClass t1 = new ThreadClass(counter);
        ThreadClass t2 = new ThreadClass(counter);
        t1.start(); // exactly after this line thread is working and main thread printed counter as zero so join is important
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println("Error "+e);
        }
        System.out.println(counter.getCounter());




    }

}
