/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

/**
 *
 * @author macbook
 */
class Human
{
    String name;
    Human(String name)
    {
        this.name= name;
        System.out.println("Human");
    }
}
class Teacher extends Human
{
    Teacher(String name)
    {
        super(name);
        System.out.println("Teacher constructor");
    }
}
class Doctor extends Human
{
    Doctor(String name)
    {
        super(name);
        System.out.println("Doctor constructor");
    }
}
interface Factory
{
    Human create(String name);
}
public class ConRef {
    public static void main(String[] args) {
        Factory factory = Doctor::new;
        Human h = factory.create("Dr No");
        
        factory = Teacher::new;
        h = factory.create("Teacher Null");
    }
}
