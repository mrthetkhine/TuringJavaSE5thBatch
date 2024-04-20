/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

import static com.turing.javase.javase5thbatch.chapter15.FunctionalInterfaceDemo.add;

/**
 *
 * @author macbook
 */
interface Fun
{
    int method(int a, int b);
    //void something();
}
interface SideEffect
{
    void sideEffect();
}
public class FunctionalInterfaceDemo {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int div(int a,int b)
    {
        return a/b;
    }
    static void doSomething()
    {
        System.out.println("Do Something");
    }
    void instanceMethod()
    {
        System.out.println("Instance method");
    }
    public static void main(String[] args) {
        Fun fun = FunctionalInterfaceDemo::add;
        
        System.out.println("Fun "+fun.method(10, 2));
        
        fun = FunctionalInterfaceDemo::div;
        System.out.println("Fun "+fun.method(10, 2));
        
        SideEffect fun2 = FunctionalInterfaceDemo::doSomething;
        fun2.sideEffect();
        
        var obj = new FunctionalInterfaceDemo();
        fun2 = obj::instanceMethod;
        fun2.sideEffect();
        
        fun = (a,b)-> a*b;
        System.out.println("Fun "+fun.method(10, 2));
        
        fun = (int a,int b)-> {
            System.out.println("Lambda multiline function");
            return a*b;
        };
        System.out.println("Fun "+fun.method(10, 2));
    }
}
