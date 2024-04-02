/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import com.turing.javase.javase5thbatch.chapter11.*;
import java.util.concurrent.Semaphore;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    String name;
    Semaphore semaphore;
    MyThread(String name,Semaphore semaphore)
    {
        super(name);
        this.name = name;
        this.semaphore = semaphore;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            
            
            try
            {
                this.semaphore.acquire();
                System.out.println("Thread "+Thread.currentThread().getName()+" i=> "+i);
                
                        
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            try
            {
                Thread.sleep(3000);
                this.semaphore.release();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class SemaphoreDemo {
    public static void main(String[] args) {
        System.out.println("Threadname "+Thread.currentThread().getName());
        Semaphore sm = new Semaphore(2);
        MyThread threadOne = new MyThread("One",sm);
        MyThread threadTwo = new MyThread("Two",sm);
        MyThread threadThree = new MyThread("Three",sm);
        MyThread threadFour = new MyThread("Four",sm);
        
        
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        
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
