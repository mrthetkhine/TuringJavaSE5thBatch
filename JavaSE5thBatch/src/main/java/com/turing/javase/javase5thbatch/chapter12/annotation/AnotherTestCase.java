/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12.annotation;

/**
 *
 * @author macbook
 */
public class AnotherTestCase {
    void method()
    {
        System.out.println("Method");
    }
    @MyTest
    public void testCase1()
    {
        System.out.println("Test case 1 of another test case");
    }
}
