/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestDemo {
    static int add(int a, int b)
    {
        return a+b;
    }
    void normalMethod()
    {
        System.out.println("Normal method");
    }
    @Test
    public void testAdd()
    {
        System.out.println("Test case");
        assertEquals(3,add(1,2));
    }
}
