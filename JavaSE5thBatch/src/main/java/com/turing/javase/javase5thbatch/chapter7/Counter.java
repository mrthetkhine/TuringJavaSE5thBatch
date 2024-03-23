/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Counter {
    private static int counter = 0;
    
    public Counter()
    {
        Counter.counter++;
    }
    static int getCount()
    {
        return Counter.counter;
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        
        System.out.println("Count "+Counter.counter);
        final double PI = 1.314;
        //PI = 3;
    }
}
