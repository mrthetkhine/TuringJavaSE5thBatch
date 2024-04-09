/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter13;

/**
 *
 * @author macbook
 */
class Monkey
{
    String name;
    int age;
    
    Monkey(String name, int age)
    {
        System.out.println("Constructor name,age");
        this.name = name;
        this.age = age;
    }
    Monkey(String name)
    {
        this(name,0);
        System.out.println("Constructor,age");   
    }
}
public class OverloadConDemo {
    public static void main(String[] args) {
        Monkey h = new Monkey("Test");
        
    }
}
