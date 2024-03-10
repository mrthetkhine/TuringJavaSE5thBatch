/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        byte c = 10;
        boolean flag = false;
        
        //int result = a + flag;
        c += a;// c = (byte)(c+a);
        
        System.out.println(a/b);
        System.out.println(a/2.0);
        
        a += b + 2;// a = (a+ (b+2));
        System.out.println("A "+a);
        
        a--;//a= a-1;
        System.out.println("A "+a);
        //System.out.println(" "+ 2**3);
    }
}
