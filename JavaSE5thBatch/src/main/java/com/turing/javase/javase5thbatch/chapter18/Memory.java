/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class Memory {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("FreeMemory "+rt.freeMemory());
        
        Integer []ints = new Integer[100000];
        System.out.println("FreeMemory "+rt.freeMemory());
        ints = null;
        rt.gc();
        System.out.println("FreeMemory "+rt.freeMemory());
        System.out.println("Version "+Runtime.version());
    }
}
