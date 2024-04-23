/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(100);
        list.add(7);
        list.add(22);
        list.add(12);
        list.add(10);
        list.add(15);
        list.add(4);
        
        Stream<Integer> stream = list.stream();
        
        /*
        Iterator<Integer> iterator = stream.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        */
        Spliterator<Integer> spliterator = stream.spliterator();
        while(spliterator.tryAdvance(n->System.out.println(n)));
    }
}
