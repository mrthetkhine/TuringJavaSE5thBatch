/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class SetVsListDemo {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        double start = System.currentTimeMillis();
        boolean index = list.contains(999999);
        double end = System.currentTimeMillis();
        
        System.out.println("Contains "+index + " Time "+ (end-start));
        */
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        double start = System.currentTimeMillis();
        boolean index = hashSet.contains(999999);
        double end = System.currentTimeMillis();
        System.out.println("Contains "+index + " Time "+ (end-start));
        
    }
}
