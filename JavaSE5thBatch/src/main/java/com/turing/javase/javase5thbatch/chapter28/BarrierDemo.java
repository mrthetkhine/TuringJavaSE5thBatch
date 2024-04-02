/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    CyclicBarrier cb;
    String name;
    MyThread(CyclicBarrier cb,String name)
    {
        this.cb = cb;
        this.name = name;
    }
    public void run()
    {
        
        try
        {
            Thread.sleep((long)(2000*Math.random()));
            System.out.println("Thread arrived "+this.name);
            this.cb.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
class BarAction implements Runnable
{
    
    public void run()
    {
        System.out.println("All arrived time to go");
    }
}
public class BarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        
        new MyThread(cb,"one").start();
        new MyThread(cb,"two").start();
        new MyThread(cb,"three").start();
        //new MyThread(cb,"four").start();
        //new MyThread(cb,"five").start();
    }
}
