/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class ProducerWithCL extends Thread
{
    CountDownLatch latch;
    ProducerWithCL(CountDownLatch cl)
    {
        this.latch = cl;
    }
    public void run()
    {
        try
        {
            
            Thread.sleep((long) (1000* Math.random()));
            System.out.println("Producer Task done");
            this.latch.countDown();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class ConsumerWithCL extends Thread
{
    CountDownLatch latch;
    ConsumerWithCL(CountDownLatch cl)
    {
        this.latch = cl;
    }
    public void run()
    {
        try
        {
            this.latch.await();
            System.out.println("Consumer Task done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cl = new CountDownLatch(3);
        System.out.println("Start");
        ProducerWithCL th1 = new ProducerWithCL(cl);
        ProducerWithCL th2 = new ProducerWithCL(cl);
        ProducerWithCL th3 = new ProducerWithCL(cl);
        
        ConsumerWithCL cThread = new ConsumerWithCL(cl);
       
        cThread.start();
         
        th1.start();
        th2.start();
        th3.start();
            
    }
}
