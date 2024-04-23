/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter29;

import com.turing.javase.javase5thbatch.chapter14.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        ArrayList<String> items= new ArrayList<>();
        
        items.add("Apple");
        items.add("Orange");
        items.add("Banana");
        items.add("Blueberry");
        
        Stream<Pair<String,Integer>> lowerItems = items.stream()
                                    .map(item->new Pair<String,Integer>(item.toLowerCase(),item.length()))
                                    .filter(pair->pair.getSecond() == 6); 
        List<Pair<String,Integer>> list = lowerItems.collect(Collectors.toList());
        list.forEach(pair->{
            System.out.println("Str "+pair.getFirst()+" "+pair.getSecond());
        });
    }
}
