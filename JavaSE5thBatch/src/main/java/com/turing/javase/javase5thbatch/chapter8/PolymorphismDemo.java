/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter8;


/**
 *
 * @author macbook
 */
abstract class Human
{
    public abstract void work();
    final void method()
    {
        System.out.println("Final method");
    }
    
}
class Teacher extends Human
{
    @Override
    public void work()
    {
        System.out.println("Teacher work");
    }
    /*
    void method()
    {
    }*/
}
class Doctor extends Human
{
    @Override
    public void work()
    {
        System.out.println("Doctor work");
    }
}
class Engineer extends Human
{
    @Override
    public void work()
    {
        System.out.println("Engineer work");
    }
}
public class PolymorphismDemo {
    static void workEveryone(Human[] humans)
    {
        for (Human h : humans) {
            h.work();
        }
    }
    public static void main(String[] args) {
        //Human h = new Human();
        Human humans [] = new Human[]{
            new Teacher(),
            new Doctor(),
            new Engineer(),
        };
        workEveryone(humans);
    }
}
