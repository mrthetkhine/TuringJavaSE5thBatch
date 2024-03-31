/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter11;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    String name;
    MyThread(String name)
    {
        super(name);
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+Thread.currentThread().getName()+" i=> "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Threadname "+Thread.currentThread().getName());
        /*
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        */
        MyThread threadOne = new MyThread("One");
        MyThread threadTwo = new MyThread("Two");
        MyThread threadThree = new MyThread("Three");
        
        threadOne.setPriority(Thread.MIN_PRIORITY);
        threadThree.setPriority(Thread.MAX_PRIORITY);
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        
        System.out.println("isAlive "+threadOne.isAlive());
        try
        {
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("isAlive "+threadOne.isAlive());
        System.out.println("Hello");
    }
}
