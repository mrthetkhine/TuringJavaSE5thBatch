/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class NestedClass {
    int outer = 10;
    
    void outerMethod()
    {
        Inner inner = new Inner();
        inner.method();
    }
    class Inner
    {
        void method()
        {
            System.out.println("Outer .outer "+outer);
        }
    }
    public static void main(String[] args) {
        NestedClass nested = new NestedClass();
        nested.outerMethod();
    }
}
