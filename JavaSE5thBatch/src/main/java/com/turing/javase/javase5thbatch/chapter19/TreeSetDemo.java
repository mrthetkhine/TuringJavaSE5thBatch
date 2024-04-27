/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author macbook
 */
class Human 
{
    String name;
    int age;
    
    Human(String name, int age)
    {
        this.name = name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }

   
    
}
class HumanComparator implements Comparator<Human>
{
 @Override
    public int compare(Human o1, Human o2) {
        return o1.age - o2.age;
    }

    
    
}
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Human> list = new TreeSet<Human>(new HumanComparator());
        list.add(new Human("Aung Aung",30));
        list.add(new Human("Aung Mya",20));
        list.add(new Human("Hla Aung",35));
        list.add(new Human("Mya Mya",19));
        list.add(new Human("Aung Win",19));
        
        list.forEach(System.out::println);
    }
}
