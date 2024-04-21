/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(100);
        list.add(7);
        list.add(22);
        list.add(12);
        list.add(10);
        list.add(15);
        list.add(4);
        
        Optional<Integer> sum = list.stream()
                                    .reduce((a,b)->{
                                        System.out.println("A "+a+" B "+b);
                                        return a+b;
                                    });
        System.out.println("Sum "+sum.get());
        
        Optional<Integer> max = list.stream()
                                    .reduce((a,b)->{
                                        System.out.println("A "+a+" B "+b);
                                        return a>b?a:b;
                                    });
        System.out.println("Max "+max.get());
    }
}
