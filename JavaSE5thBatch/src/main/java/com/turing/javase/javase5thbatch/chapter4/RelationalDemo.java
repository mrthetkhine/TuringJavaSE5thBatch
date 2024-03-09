/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class RelationalDemo {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        
        System.out.println("a == b " +(a == b));
        System.out.println("a != b "+ (a != b));
        
        char ch = 'A';
        boolean result = 2== ch;
        System.out.println( " 2== ch "+(2 == ch) );
        
        //System.out.println("true > false ", ( true > false));
        System.out.println(" 1 > 3 "+( 1 > 3));
        System.out.println(" 1 < 3 "+( 1 < 3));
        System.out.println(" 1 <= 1 "+( 1 <= 1));
        
        //System.out.println("Hello">"Apple");
        System.out.println("Banana compare Apple =>"+ "Banana".compareTo("Apple"));
        
    }
}
