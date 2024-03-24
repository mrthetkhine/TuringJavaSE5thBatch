/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringApiDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Contains "+str.contains("Hell"));
        byte bytes[] = str.getBytes();
        System.out.println("Bytes "+bytes);
        
        System.out.println("LastIndexOf "+ str.lastIndexOf("l"));
        System.out.println("Replae "+str.replace("ll", "hh"));
        System.out.println("RepalceFirst "+str.replaceFirst("l", "k"));
        
        String headers ="Bearer token";
        String []words = headers.split(" ");
        for(String word : words)
        {
            System.out.println("Word "+word);
        }
        String strTwo = " Hello ";
        System.out.println("Trim "+ strTwo.trim());
        System.out.println("Trim length "+ strTwo.trim().length());
        
        long data = 213;
        String str3 = String.valueOf(data);
        System.out.println("Str3 "+str3);
        
        String str4  = "Hello\nWorld";
        str4.lines().forEach(System.out::println);
        
        System.out.println("*".repeat(10));
    }
}
