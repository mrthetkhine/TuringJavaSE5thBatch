/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Factorial {
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int result = fact(10);
        System.out.println("4! "+result);
    }
}
