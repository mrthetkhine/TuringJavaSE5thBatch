/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ChainedException {
    static void method()
    {
        NullPointerException ne = new NullPointerException("top layer");
        ne.initCause(new ArithmeticException("Caused by AE"));
        throw ne;
    }
    public static void main(String[] args) {
        try
        {
            method();
        }
        catch(NullPointerException ne)
        {
            System.out.println("Caught "+ne.getMessage());
            System.out.println("Get Cause "+ne.getCause());
        }
                
    }
}
