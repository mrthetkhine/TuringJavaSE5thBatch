/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author macbook
 */
class SqrtTransform extends RecursiveAction
{
    final int THRESHOLD = 1000;
    double data[];
    int start,end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
        System.out.println("Start "+start+" end "+end);
    }
    
    
    @Override
    protected void compute() {
        if ( end-start< THRESHOLD)
        {
            for (int i = start; i < end; i++) {
                data[i]= Math.sqrt(data[i]);
            }
        }
        else
        {
            int middle= (start+end) /2;
            invokeAll(new SqrtTransform(data,start,middle),
                     new SqrtTransform(data,middle,end));
        }
    }
    
}
public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double nums [] = new double[20000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        SqrtTransform transform = new SqrtTransform(nums,0,nums.length);
        fjp.invoke(transform);
        
        System.out.println("Done");
        for (int i = 0; i < 10; i++) {
            System.out.println(" "+nums[i]);
        }
    }
}
