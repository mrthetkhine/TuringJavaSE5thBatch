/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class PrePostOperator {
    public static void main(String[] args) {
        int b = 20;
        int a = 10;
        //b = a++;//b=a; a++;
        b = ++a + a;//++a, b = a;
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        float c = 5;
        float d = 2;
        System.out.println("c % d "+ (c%d));
    }
}
