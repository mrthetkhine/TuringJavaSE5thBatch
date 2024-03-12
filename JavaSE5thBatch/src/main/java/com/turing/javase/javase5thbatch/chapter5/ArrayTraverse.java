/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
            total += arr[i];
        }
        
        
        /*
        for(int i: arr)//i = arr[index]
        {
            i*=2;
            //total+= i;
        }*/
        System.out.println("Arr ");
        for(final var i:arr)
        {
            //i = 3;
            System.out.println("I "+i);
        }
        System.out.println("Total "+total);
    }
}
