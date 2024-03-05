/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class IntegerLiteralDemo {
    public static void main(String[] args) {
        int data = 0b101;
        System.out.println("Data "+data);
        
        data = 123_456;
        data = 0xFF11;
        System.out.println("Data "+data);
        
        data = 017;
        System.out.println("Data "+data);
    }
}
