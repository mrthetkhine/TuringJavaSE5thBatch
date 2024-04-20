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
    
    public static void main(String[] args) {
        Predicate2<Integer> fun = (n)->n%2==0;
        System.out.println("Fun isEven "+fun.test(2));
        
        Predicate2<Double> fun2 = (n)->n.doubleValue()%2==0;
        System.out.println("Fun isEven "+fun2.test(2.0));
    }
  
}
