package com.newhut.threads;

/**
 *
 * @author Ummu Hanisah
 * @title Intermediate Java Tutorial - 26 - Learning about Threads by thenewboston
 * @source https://www.youtube.com/watch?v=VYN-CBtPNiM
 */
public class Bucky {
    public static void main(String[] args) { // put the name of 
        Thread t1 = new Thread(new Tuna("one")); // we can pass class Tuan because we implement Runnable in Tuna class
        Thread t2 = new Thread(new Tuna("two")); // create thread object, each object will has its own thread
        Thread t3 = new Thread(new Tuna("three")); // these thread will run simultaneously
        Thread t4 = new Thread(new Tuna("four"));
        // we create the thread and not start them yet
        
        t1.start(); // start() -> means call the run() method.
        t2.start();
        t3.start();
        t4.start();
    }
}
