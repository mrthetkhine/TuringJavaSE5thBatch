/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class GarbageCollectionDemo {
    void allocate()
    {
        
    }
    public static void main(String[] args) {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory "+ runtime.totalMemory());
        System.out.println("Free Memory "+ runtime.freeMemory());
        
        int [][]arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[10000000];
        }
        System.out.println("Total Memory "+ runtime.totalMemory());
        System.out.println("Free Memory "+ runtime.freeMemory());
        
        arr = null;
        System.gc();
        System.out.println("Free Memory "+ runtime.freeMemory());
    }
}
