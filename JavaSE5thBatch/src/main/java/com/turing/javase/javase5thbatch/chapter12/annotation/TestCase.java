/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12.annotation;

/**
 *
 * @author macbook
 */
public class TestCase {
    
    //@MyTest
    String field;
    
    @MyTest
    void testCase1()
    {
        System.out.println("Test case1");
    }
    @MyTest
    void testCase2()
    {
        System.out.println("Test case 2");
    }
    void normalMethod()
    {
        System.out.println("Normal method");
    }
}
