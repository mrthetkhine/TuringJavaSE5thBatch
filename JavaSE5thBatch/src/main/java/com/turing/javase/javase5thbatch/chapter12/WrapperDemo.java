/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 10;
        i++;
        System.out.println("I instanceof Object "+ (i instanceof Object));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        
        Character ch = Character.valueOf('A');
        
        Double d = Double.valueOf(12);
        System.out.println("D "+d);
    }
}
