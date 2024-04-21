/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter29;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 100000000; i++) {
            list.add(random.nextInt(1000));
        }
        double start = System.currentTimeMillis();
        Stream<Integer> evenList = list.stream()
                                        .filter((n)->n%2==0);
        double end = System.currentTimeMillis();
        double time = end-start;
        System.out.println("Time in mili "+time);
        
        start = System.currentTimeMillis();
        Stream<Integer> evenList2 = list.parallelStream()
                                        .filter((n)->n%2==0);
        end = System.currentTimeMillis();
        time = end-start;
        System.out.println("Time in mili "+time);
    }
}
