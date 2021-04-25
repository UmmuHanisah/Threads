package com.newhut.threads;

import java.util.Random;

/**
 *
 * @author Ummu Hanisah
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
        time = r.nextInt(999); // between 0 t0 999ms ~ 1 sec
    }
    
    @Override
    public void run() { // this run method will get call whenever you start the thread
        try {
            System.out.printf("%s us sleeping for %d\n", name, time);
            Thread.sleep(time); // we are going to put how long we are going to sleep
            System.out.printf("%s is done\n", name); // when we wake up, we going to print this
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
