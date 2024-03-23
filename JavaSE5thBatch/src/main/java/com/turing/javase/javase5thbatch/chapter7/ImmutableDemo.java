/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class ImmutableDemo {
    static void concatWithString()
    {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+time);    
    }
    static void concatWithStringBuffer()
    {
        long start = System.currentTimeMillis();
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+time);    
    }
    public static void main(String[] args) {
        concatWithString();
        concatWithStringBuffer();
    }
}
