/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        System.out.println("a "+Integer.toBinaryString(a));
        System.out.println("b "+ Integer.toBinaryString(b));
        System.out.println("a & b "+Integer.toBinaryString(a & b));
        System.out.println("a | b "+Integer.toBinaryString(a | b));
        System.out.println("a ^ b "+Integer.toBinaryString(a ^ b));
        System.out.println("~a  "+Integer.toBinaryString(~a ));
        System.out.println("a>>1 "+Integer.toBinaryString(a>>1));
        System.out.println("a>>1 "+ (a>>1));
        System.out.println("a << 1 "+Integer.toBinaryString(a<<1));
    }
}
