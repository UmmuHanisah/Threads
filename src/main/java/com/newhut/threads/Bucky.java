package com.newhut.threads;

/**
 *
 * @author Ummu Hanisah
 */
public class Bucky {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Tuna("one")); // we can pass class Tuan because we implement Runnable in Tuna class
        Thread t2 = new Thread(new Tuna("two"));
        Thread t3 = new Thread(new Tuna("three"));
        Thread t4 = new Thread(new Tuna("four"));
        // we create the thread and not start them yet
        
        t1.start(); // start() -> means call the run() method.
        t2.start();
        t3.start();
        t4.start();
    }
}
