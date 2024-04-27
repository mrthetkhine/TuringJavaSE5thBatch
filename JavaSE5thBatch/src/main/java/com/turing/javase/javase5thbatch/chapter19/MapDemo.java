/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(1, "user-1");
        map.put(2,"user-2");
        map.put(1, "Aung Aung");
        
        System.out.println("id-1 "+map.get(1));
        System.out.println("Key contains "+map.containsKey(2));
        
        Set<Integer> keys = map.keySet();
        keys.forEach(key-> {
            System.out.println("Key "+key + " Value "+map.get(key));
        });
        
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        
        map.forEach((key,value)->{
            System.out.println("Key "+key + " Value "+value);
        });
    }
}
