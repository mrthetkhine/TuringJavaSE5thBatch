/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Optional;

/**
 *
 * @author macbook
 */
public class OptionalDemo {
    
    static String items[]= {"Hello","World"};
    static Optional<String> getData(int index)
    {
        if(index < items.length)
        {
            return Optional.of(items[index]);
        }
        else
        {
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
        Optional<String> data = getData(2);
        
        String result = data.map(str->str.toUpperCase())
                        .orElse("Default");
        System.out.println("Result "+result);
            
                            
    }
}
