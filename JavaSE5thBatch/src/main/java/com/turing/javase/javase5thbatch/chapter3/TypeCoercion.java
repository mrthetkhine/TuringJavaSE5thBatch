/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class TypeCoercion {
    public static void main(String[] args) {
        byte b = 100;
        int c = b * b;
        short d = 10;
        short e = (short) (d+1);
        System.out.println("C "+c);
       
        char ch = 'A';
        int data = ch;
        
        c = d;
        //d = c;
    }
}
