/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class MethodDemo {
    
    int add(int a, int b)//parameter
    {
        return a +b;
    }
    
    public void print(String msg)
    {
        System.out.println(msg);
        System.out.println("World");
    }
    public static void main(String[] args) {
        MethodDemo obj = new MethodDemo();
        
        obj.print("Good Morning");
        System.out.println("----");
        obj.print("Hello");
        
        int result = obj.add(10, 20);//arguments
        System.out.println("Result "+result);
        System.out.println("Math.max(5,2) "+Math.max(5, 2));
    }
}
