/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class SortDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("apple");
        list.add("orange");
        
        list.sort((a,b)->b.compareTo(a));
        list.forEach(System.out::println);
        
        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(100);
        iList.add(20);
        iList.add(203);
        
        iList.sort((a,b)-> a-b);
        
        iList.forEach(System.out::println);
    }
}
