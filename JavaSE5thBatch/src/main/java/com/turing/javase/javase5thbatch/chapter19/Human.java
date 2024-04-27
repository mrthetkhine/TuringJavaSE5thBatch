/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.Comparator;

/**
 *
 * @author macbook
 */
public class Human implements Comparator<Human>
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

    @Override
    public int compare(Human o1, Human o2) {
        return o1.age - o2.age;
    }
    
}
