/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("Str == str2 "+(str == str2));
        System.out.println("Str == str3 "+(str == str3));
        System.out.println("Upper "+str.toUpperCase());
        System.out.println("Str "+str);
        
        System.out.println("Hello".concat("World"));
        
        System.out.println("CharAt "+str.charAt(0));
        System.out.println("CodePoint "+str.codePointAt(0));
        System.out.println("Length "+str.length());
        System.out.println("Substring "+str.substring(0, 3));
        System.out.println("Substring 3 "+str.substring(3));
        
        System.out.println("a compare b "+ "a".compareTo("b"));    
        System.out.println("b compare a "+ "b".compareTo("a"));   
        System.out.println("b compare b "+ "b".compareTo("b")); 
        
        System.out.println("endWith "+ str2.endsWith("llo"));
        
        System.out.println("IndexOf "+str.indexOf("Hell"));
        System.out.println("isEmpty "+str.isEmpty());
        System.out.println("isBlank "+ (" ".isBlank()));
        System.out.println("isEmpty "+ (" ".isEmpty()));
    }
}
