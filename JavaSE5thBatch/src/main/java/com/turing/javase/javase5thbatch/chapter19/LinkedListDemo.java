/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.LinkedList;

/**
 *
 * @author macbook
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("One");
        list.add("Two");
        list.addFirst("First");
        list.addLast("Last");
        
        list.removeFirst();
        list.forEach(System.out::println);
        
    }
}
