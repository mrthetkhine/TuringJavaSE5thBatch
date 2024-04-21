/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface MyFunc<T extends Number>
{
    T method(T[]arr);
}
class Min<T extends Number>
{
    T min(T[]arr)
    {
        T minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].doubleValue() < minElement.doubleValue())
            {
                minElement= arr[i];
            }
        }
        return minElement;
    }
}
class Max<T extends Number>
{
    T max(T[]arr)
    {
        T maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i].doubleValue() > maxElement.doubleValue())
            {
                maxElement= arr[i];
            }
        }
        return maxElement;
    }
}
public class GenericMethodRef {
    public static void main(String[] args) {
        Integer [] ints ={-12,0,10,200};
        Double[] doubles = {12.0,23.0,0.4};
        
        Min<Integer> minObj =new Min<>();
        MyFunc<Integer> fun = minObj::min;
        System.out.println("Min "+fun.method(ints));
        
        Max<Double> maxObj = new Max<>();
        MyFunc<Double> fun2 = maxObj::max;
        System.out.println("Max "+fun2.method(doubles));
        
    }
}
