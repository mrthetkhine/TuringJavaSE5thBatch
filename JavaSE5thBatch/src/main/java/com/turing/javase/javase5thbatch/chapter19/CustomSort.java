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

public class CustomSort {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        
        list.add(new Human("Aung Aung",30));
        list.add(new Human("Aung Mya",20));
        list.add(new Human("Hla Aung",35));
        list.add(new Human("Mya Mya",19));
        list.add(new Human("Aung Win",19));
        
        list.sort((a,b)-> {
            if(a.age==b.age)
            {
                return a.name.compareTo(b.name);
            }
            else
            {
                return a.age - b.age;
            }
        });
        
        list.forEach(System.out::println);
        
    }
}
