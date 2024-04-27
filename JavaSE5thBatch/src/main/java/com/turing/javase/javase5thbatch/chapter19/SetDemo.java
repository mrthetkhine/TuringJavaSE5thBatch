/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("Hello");
        set.add("Hi");
        set.add("Hello");
        
        set.forEach(System.out::println);
        System.out.println("Contain "+set.contains("Hi"));
        set.remove("Hello");
        System.out.println("");
        
        set.forEach(System.out::println);
        
        Set<String> setTwo = new HashSet<>();
        setTwo.add("Apple");
        setTwo.add("Banana");
        
    }
}
