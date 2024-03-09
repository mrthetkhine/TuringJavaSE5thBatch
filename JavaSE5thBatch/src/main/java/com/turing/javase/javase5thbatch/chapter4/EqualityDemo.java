/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class EqualityDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        //String str3 = new String("Hello");
        String str3 = null;
        //System.out.println("str== str2 "+ (str == str2));
        //System.out.println("str== str2 "+ (str == str3));
        
        System.out.println("str.equals "+str.equals(str3));
        System.out.println("str3.euals(Hello ) "+ ("Hello".equals(str3)));
        //System.out.println("str3.equals "+(str3.equals("Hello")));
    }
}
