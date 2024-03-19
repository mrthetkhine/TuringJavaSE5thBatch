/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class OverloadTwoDemo {
    static void method(String str,int a)
    {
        System.out.println("String int version");
    }
    static void method(String str,float a)
    {
        System.out.println("String float version");
    }
    static void method(int a,String str)
    {
        System.out.println("int String version");
    }
    static void method(int a)
    {
        System.out.println("Int version");
        
    }
    /*
    static double method(int a)
    {
        System.out.println("Int version");
        return a;
    }*/
    static void method(long a)
    {
        System.out.println("long version");
    }
    public static void main(String[] args) {
        method("",123);
        method("",1.2F);
        method(122,"Hello");
        byte b = 120;
        method(b);
    }
    
}
