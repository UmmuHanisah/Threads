package com.newhut.threads;

import java.util.Random;

/**
 *
 * @author Ummu Hanisah
 * @title Intermediate Java Tutorial - 26 - Learning about Threads @thenewboston
 * @source https://www.youtube.com/watch?v=VYN-CBtPNiM
 */


/*Thread - do all the things at the same time -> open youtube tab - let it's loading and at the same time watch other video*/
// Runnable interface contains run() method
public class Tuna implements Runnable {
    String name;
    int time;
    Random r = new Random();
    
    public Tuna(String x) {
        name = x;
        
        // put thread to sleep is make it do nothing, just chillax and wait something to happen
        time = r.nextInt(999); // between 0 t0 1 sec
    }
    
    @Override
    public void run() {
        try {
            System.out.printf("%s us sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
