/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = new int[5];
        
        System.arraycopy(arr1, 0, arr2, 0, 5);
        
        for(int a : arr2)
        {
            System.out.println(a);
        }
        System.out.println("JavaHome "+System.getProperty("java.home"));
        System.out.println("UserHome "+System.getProperty("user.home"));
        System.out.println("CurrentDir "+System.getProperty("user.dir"));
        System.out.println("Seperator "+System.getProperty("path.separator"));
    }
}
