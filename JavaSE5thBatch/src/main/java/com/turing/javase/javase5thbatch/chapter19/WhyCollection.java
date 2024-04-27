/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbook
 */
public class WhyCollection {
    public static void main(String[] args) {
        int []arr =new int[5];
        
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("3");
        
        list.remove("3");
        System.out.println("Size "+list.size());
        list.forEach(System.out::println);
        
        System.out.println("Contain "+list.contains("3"));
        System.out.println("IndexOf "+list.indexOf("3"));
        System.out.println("get(1) "+list.get(1));
        
        list.set(1, "two");
        System.out.println("");
        list.forEach(System.out::println);
        
        list.add(1, "NextElement");
        System.out.println("");
        list.remove(2);
        list.forEach(System.out::println);
        
        String[] list2 =new String[list.size()];
        list2 = list.toArray(list2);
        for(String data : list2)
        {
            System.out.println("Data "+data);
        }
        //list = new ArrayList<String>(list2);
        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
        
        list.forEach(item->{
            System.out.println("Do something "+item);
        });
    }
}
