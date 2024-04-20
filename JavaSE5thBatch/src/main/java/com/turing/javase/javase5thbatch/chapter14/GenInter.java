/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
interface MinMax<T extends Comparable<T>>
{
    T min();
    T max();
}
class MinMaxImpl <T extends Comparable<T>> implements MinMax<T>
{
    T[] values;
    MinMaxImpl(T[] values)
    {
        this.values = values;
    }

    @Override
    public T min() {
        T minElement = this.values[0];
        for (int i = 1; i < this.values.length; i++) {
            if(this.values[i].compareTo(minElement)<0)
            {
                minElement = this.values[i];
            }
        }
        return minElement;
    }

    @Override
    public T max() {
        T maxElement = this.values[0];
        for (int i = 1; i < this.values.length; i++) {
            if(this.values[i].compareTo(maxElement)>0)
            {
                maxElement = this.values[i];
            }
        }
        return maxElement;
    }
}
public class GenInter {
    public static void main(String[] args) {
        Integer[]ints = {1,29,-12,20,100};
        
        MinMaxImpl minMax =new MinMaxImpl(ints);
        System.out.println("Min "+minMax.min());
        System.out.println("Max "+minMax.max());
        
        String[] strs = {"Apple","orange","Banana"};
        
        MinMaxImpl minMax2 =new MinMaxImpl(strs);
        System.out.println("Min "+minMax2.min());
        System.out.println("Max "+minMax2.max());
    }
}
