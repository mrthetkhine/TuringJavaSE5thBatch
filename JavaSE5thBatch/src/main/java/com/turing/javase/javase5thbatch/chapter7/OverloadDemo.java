/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class OverloadDemo {
    
    static void print(String data)
    {
        
        System.out.println("String version "+data);
    }
    static void print(boolean data)
    {
        
        System.out.println("Boolean version "+data);
    }    
    public static void main(String[] args) {
        boolean flag = false;
        String data = "Hello";
        
        print(data);
        print(flag);
    }
}
