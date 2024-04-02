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
    Semaphore semaphore;
    IncThread(Data data,Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            try
            {
                 this.semaphore.acquire();
                 this.data.value ++;
                 this.semaphore.release();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
           
           
        }
    }
}
public class SynchronizationProblemWithSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Data data = new Data(0);
        IncThread t1 = new IncThread(data,semaphore);
        IncThread t2 = new IncThread(data,semaphore);
        IncThread t3 = new IncThread(data,semaphore); 
        
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
