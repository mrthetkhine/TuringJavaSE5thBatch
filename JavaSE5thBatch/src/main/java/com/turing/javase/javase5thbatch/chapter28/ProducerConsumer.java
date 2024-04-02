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
class Q
{
    int n;
    static Semaphore semProducer = new Semaphore(1);
    static Semaphore semConsumer = new Semaphore(0);
    int get()
    {
        try
        {
            semConsumer.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
        System.out.println("Get "+n);
        semProducer.release();
        return n;
    }
    void put(int n)
    {
        try
        {
            semProducer.acquire();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        this.n = n;
        
        System.out.println("put "+n);
        semConsumer.release();
        
    }
}
class Producer extends Thread
{
    Q q;
    Producer(Q q)
    {
        this.q = q;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            q.put(i);
            
        }
    }
}
class Consumer extends Thread
{
    Q q;
    Consumer(Q q)
    {
        this.q = q;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            int data = q.get();
            System.out.println("Consumer get "+data);
            
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Q queue = new Q();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);
        
        p.start();
        c.start();
        
        try
        {
            p.join();
            c.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
