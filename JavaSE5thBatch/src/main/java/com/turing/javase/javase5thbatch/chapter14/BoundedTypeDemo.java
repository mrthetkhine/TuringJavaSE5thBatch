/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Stats<T extends Number>
{
    T[] nums;
    
    Stats(T[]nums)
    {
        this.nums = nums;
    }
    double average()
    {
        double sum = 0;
        for (int i = 0; i < this.nums.length; i++) {
            sum+= this.nums[i].doubleValue();
        }
        return sum/this.nums.length;
    }
    boolean sameAverage(Stats<?> obj)
    {
        return this.average()==obj.average();
    }
}
public class BoundedTypeDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        Stats<Integer> stats = new Stats(arr);
        System.out.println("Average "+stats.average());
        
        String[] strArr = {"Hello","Hi"};
        //Stats<String> stat2 = new Stats(strArr);
        Double[] dArr = {1.0,2.0,3.0,4.0};
        Stats<Double> dStat = new Stats(dArr);
        
        System.out.println("Same average "+stats.sameAverage(dStat));
    }
}
