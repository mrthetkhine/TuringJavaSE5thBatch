/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(12);
        
        list.sort((a,b)->a-b);
        Integer []arr = list.toArray(new Integer[list.size()]);
        
        System.out.println("BinarySearch "+ Arrays.binarySearch(arr, 12));
        System.out.println("BinarySearch "+ Arrays.binarySearch(arr, 102));
        
        //Integer[] newArr = Arrays.copyOf(arr, 3);
        Integer[] newArr = Arrays.copyOfRange(arr, 1,3);
        for(Integer item : newArr)
        {
            System.out.println("New Item "+item);
        }
        
        Integer another[]= {5,10};
        System.out.println("Equal "+ Arrays.equals(newArr, another));
        
        Arrays.fill(another,100);
        
        for(Integer item : another)
        {
            System.out.println("another Item "+item);
        }
        int arr2 [] = new int[5];
        System.out.println("----");
        for(Integer item : arr2)
        {
            System.out.println("Arr2 Item "+item);
        }
    }
}
