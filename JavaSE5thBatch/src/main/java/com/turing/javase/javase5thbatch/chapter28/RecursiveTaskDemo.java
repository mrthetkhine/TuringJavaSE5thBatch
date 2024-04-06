/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author macbook
 */
class Sum extends RecursiveTask<Double>
{
    final int THRESHOLD = 1000;
    double data[];
    int start,end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
        System.out.println("Start "+start+" end "+end);
    }
    @Override
    protected Double compute() {
        double sum = 0;
        if ( end-start< THRESHOLD)
        {
            for (int i = start; i < end; i++) {
                sum+= data[i];
            }
        }
        else
        {
            int middle= (start+end) /2;
            Sum taskA = new Sum(data,start,middle);
            Sum taskB = new Sum(data,middle+1,end);
            
            taskA.fork();
            taskB.fork();
            sum = taskA.join()+taskB.join();
        }
        return sum;
    }
    
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double nums [] = new double[2000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        Sum sum = new Sum(nums,0,nums.length);
        double total = fjp.invoke(sum);
        
        System.out.println("Done "+total);
       
    }
}
