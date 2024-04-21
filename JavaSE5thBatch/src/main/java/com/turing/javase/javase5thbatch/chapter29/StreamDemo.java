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
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(100);
        list.add(7);
        list.add(22);
        list.add(12);
        list.add(10);
        list.add(15);
        list.add(4);
        
        Stream<Integer> intStream = list.stream();
        Optional<Integer> min = intStream.min(Integer::compare);
        System.out.println("Min "+min.get());
        
        intStream = list.stream();
        Optional<Integer> max = intStream.max(Integer::compare);
        System.out.println("Max "+max.get());
        
        Stream<Integer> sortedStream = list.stream().sorted();
        sortedStream.forEach(System.out::println);
        
        System.out.println("---");
        list.forEach(System.out::println);
        
        Predicate<Integer> isOdd = (n)->n%2==1;
        Stream<Integer> filteredList = list
                                            .stream()
                                            .sorted()
                                            .filter(n->n>=10)
                                            .filter(isOdd);
        System.out.println("");
        filteredList.forEach(System.out::println);
    }
}
