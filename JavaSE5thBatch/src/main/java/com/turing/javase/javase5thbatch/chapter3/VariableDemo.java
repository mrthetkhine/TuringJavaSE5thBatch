/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class VariableDemo {
    public static void main(String[] args) {
        int a = 12;
        double b = 13.1;
        // String str = 12;
        //int result = a * str;
        a = 2147483647;
        System.out.println("A "+a);
        a++;
        System.out.println("A "+a);
        byte data = -128;
        data --;
        System.out.println("Data "+data);
        
        float f = 3.2F;
        
        char ch = 'A';
        ch++;
        System.out.println("Ch "+ch);
        
        boolean flag = true;
        flag= false;
        System.out.println("Flag "+flag);
    }
}
