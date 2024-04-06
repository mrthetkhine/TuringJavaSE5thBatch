/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author macbook
 */
class Sum implements Callable<Integer>
{
    int stop ;
    Sum(int stop)
    {
        this.stop = stop;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < stop; i++) {
            sum += i;
            
            
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished Sum");
        return sum;
    }
}
class Factorial implements Callable<Integer>
{
    int n;
    Factorial(int n)
    {
        this.n = n;
    }
    @Override
    public Integer call() throws Exception {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Finished Fact");
        return result;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> sum;
        Future<Integer> fact;
        
        System.out.println("Starting");
        sum = es.submit(new Sum(10));
        fact = es.submit(new Factorial(10));
        
        try {
            System.out.println("Sum "+sum.get(2500,TimeUnit.MILLISECONDS));
            System.out.println("Fact "+fact.get());
        } catch (Exception e) {
            System.out.println("Timeout");
            e.printStackTrace();
        }
        es.shutdown();
 
    }
}
