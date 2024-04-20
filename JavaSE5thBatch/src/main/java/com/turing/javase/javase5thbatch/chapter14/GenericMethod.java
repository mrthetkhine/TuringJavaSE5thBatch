/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Util
{
    static <T extends Comparable<T>>boolean isIn(T item,T[]arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(item.equals(arr[i]))
            {
                return true;
            }
        }
        return false;
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,100,3};
        Integer item = 2;
        
        System.out.println("isIn "+Util.isIn(item, intArr));
        
        String[] strArr= {"Hi","Hello",};
        System.out.println("isIn "+Util.isIn("Hi",strArr));
    }
}
