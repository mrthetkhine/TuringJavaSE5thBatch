/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import com.turing.javase.javase5thbatch.chapter11.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author macbook
 */
class Data
{
    AtomicInteger value;
    Data(int value)
    {
        this.value = new AtomicInteger(value);
    }
}
class IncThread extends Thread
{
    Data data;
    IncThread(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            this.data.value.incrementAndGet();
           
        }
    }
}
public class SynchronizationWithAtomicInteger {
    public static void main(String[] args) {
        Data data = new Data(0);
        IncThread t1 = new IncThread(data);
        IncThread t2 = new IncThread(data);
        IncThread t3 = new IncThread(data); 
        
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
