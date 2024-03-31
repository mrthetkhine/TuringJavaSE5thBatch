/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter11;

/**
 *
 * @author macbook
 */
class MyThread2 implements Runnable
{
    Thread thread;
   
    MyThread2(String name)
    {
       this.thread = new Thread(this,name);  
    }
    void start()
    {
        this.thread.start();
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+Thread.currentThread().getName()+" i=> "+i);
        }
    }
}
public class ThreadDemoWithRunnable {
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
        }*/
        MyThread2 threadOne = new MyThread2("One");
        MyThread2 threadTwo = new MyThread2("Two");
        MyThread2 threadThree = new MyThread2("Three");
        
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        
        
        
    }
}
