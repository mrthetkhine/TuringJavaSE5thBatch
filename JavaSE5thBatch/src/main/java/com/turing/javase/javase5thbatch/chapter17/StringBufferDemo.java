/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Length "+buffer.length());
        System.out.println("Capacity "+buffer.capacity());
        
        buffer.setLength(3);
        System.out.println("buffer "+buffer.toString());
        buffer.insert(3, "World");
        buffer.reverse();
        buffer.deleteCharAt(3);
        System.out.println("buffer "+buffer.toString());
    }
}
