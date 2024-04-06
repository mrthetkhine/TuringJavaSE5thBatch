/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import com.turing.javase.javase5thbatch.chapter11.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author macbook
 */
class Data
{
    int value;
    Data(int value)
    {
        this.value = value;
    }
}
class IncThread extends Thread
{
    Data data;
    Lock lock;
    IncThread(Data data,Lock lock)
    {
        this.data = data;
        this.lock = lock;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            this.lock.lock();
            this.data.value++;
            this.lock.unlock();
           
        }
    }
}
public class SynchronizationWithLock {
    public static void main(String[] args) {
        Data data = new Data(0);
        Lock lock = new ReentrantLock();
        IncThread t1 = new IncThread(data,lock);
        IncThread t2 = new IncThread(data,lock);
        IncThread t3 = new IncThread(data,lock); 
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Data value "+data.value);
        
        
        
        
    }
}
