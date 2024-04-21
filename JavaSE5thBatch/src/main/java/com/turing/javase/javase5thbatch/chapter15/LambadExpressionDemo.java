/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Predicate
{
    boolean test(int n);
}
interface Predicate2<T extends Number>
{
    boolean test(T n);
}
public class LambadExpressionDemo {
    static boolean not(Predicate fun,int number)
    {
        return !fun.test(number);
    }
    
    public static void main(String[] args) {
        Predicate isEven = (n)->n%2==0;
        System.out.println("Fun isEven "+isEven.test(2));
        
        System.out.println("Odd "+ not(isEven,3));
        
        Predicate2<Double> fun2 = (n)->n.doubleValue()%2==0;
        System.out.println("Fun isEven "+fun2.test(2.0));
        
        System.out.println("Not "+not((n)->n >0,4));
    }
  
}
