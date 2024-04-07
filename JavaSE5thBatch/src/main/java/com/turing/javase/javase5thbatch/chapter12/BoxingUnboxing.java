/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class BoxingUnboxing {
    static Integer method(Integer i)
    {
        System.out.println("Method with wrapper "+i);
        return i++;
    }
    public static void main(String[] args) {
        Integer a = 10;//Autoboxing->primitive-Wrapper
        int b = a;//Wrapper->primitive
        a++;//Wrapper->primitive++->Wrapper
        
        System.out.println("A "+a);
        int c = method(11);
        
        Integer d = c + a;
    }
}
