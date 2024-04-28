/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author macbook
 */
public class AlgorithmDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(4);
        list.add(10);
        list.add(12);
        
        Comparator<Integer> reverseOrder = Collections.reverseOrder();
        Collections.sort(list,reverseOrder);
        
        list.forEach(System.out::println);
        
        Collections.shuffle(list);
        System.out.println("----");
        list.forEach(System.out::println);
        
        System.out.println("min "+Collections.min(list));
        System.out.println("max "+Collections.max(list));
    }
}
