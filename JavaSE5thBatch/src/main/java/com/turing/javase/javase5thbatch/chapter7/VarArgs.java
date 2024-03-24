/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class VarArgs {
    static int sum(int arr[])
    {
        int total =0;
        for(int a :arr)
        {
            total += a;
        }
        return total;
    }
    static int sum2(int ...arr)
    {
        int total =0;
        for(int a :arr)
        {
            total += a;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Sum "+sum(new int[]{1,2,3}));
        System.out.println("Sum "+sum(new int[]{1,2,4,5,6}));
        
        System.out.println("Sum "+sum2(new int[]{1,2,4,5,6}));
        System.out.println("Sum "+sum2(1,2,3,4,5));
    }
}
