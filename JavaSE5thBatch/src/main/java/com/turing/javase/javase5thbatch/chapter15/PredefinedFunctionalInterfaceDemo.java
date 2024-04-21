/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

/**
 *
 * @author macbook
 */
public class PredefinedFunctionalInterfaceDemo {
    public static void main(String[] args) {
        UnaryOperator<String> fun = (str)->str.toLowerCase();
        System.out.println("Fun "+fun.apply("HELLO"));
        
        fun = (str)->str.toUpperCase();
        System.out.println("Fun "+fun.apply("hi"));
        
        BinaryOperator<Integer> binary = (a,b)->a+b;
        System.out.println("Binary "+binary.apply(10, 30));
        
        Consumer<String> doSomething= (str)->{
            System.out.println("Process "+str);
        };
        doSomething.accept("Hello");
        
        Supplier<String> supplier = ()->{
            return "Hello";
        };
        System.out.println("Supplier "+ supplier.get());
        
        Function<String,Integer> function = (str)->str.length();
        System.out.println("Length "+function.apply("hello"));
        
        Predicate<Integer> predicate = (n)->n%2==0;
        System.out.println("IsEven "+predicate.test(10));
    }
}
