/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    String name;
    CountDownLatch cl;

    public MyThread(String name, CountDownLatch cl) {
        this.name = name;
        this.cl = cl;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+name);
            this.cl.countDown();
        }
    }
    
}
public class ExecutorDemo {
    public static void main(String[] args) {
        CountDownLatch cl1 = new CountDownLatch(5);
        CountDownLatch cl2 = new CountDownLatch(5);
        CountDownLatch cl3 = new CountDownLatch(5);
        CountDownLatch cl4 = new CountDownLatch(5);
        
        ExecutorService es;
        es = Executors.newFixedThreadPool(2);
        
        System.out.println("Starting");
        
        es.execute(new MyThread("A",cl1));
        es.execute(new MyThread("B",cl2));
        es.execute(new MyThread("C",cl3));
        es.execute(new MyThread("D",cl4));
        
        try
        {
            cl1.await();
            cl2.await();
            cl3.await();
            cl4.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Done");
    }
}
