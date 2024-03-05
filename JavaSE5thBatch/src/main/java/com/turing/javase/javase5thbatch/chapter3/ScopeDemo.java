/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class ScopeDemo {
    static int data=100;
    public static void main(String[] args) {
        
        int c = 10;
        {
            int data = 20;
            int a = 10;
            System.out.println("Hello");
            System.out.println("Wolrd "+c);
        }
        {
            String a = "100";
            System.out.println("Another "+a);
            //int c;
            System.out.println("Data "+data);    
        }
        System.out.println("C "+c);
    }
}
