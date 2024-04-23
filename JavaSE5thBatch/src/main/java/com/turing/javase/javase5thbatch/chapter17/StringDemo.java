/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello"+ "World";
        String str2 = new String("Hello");
        System.out.println("Str==str2 "+ str.equals(str2));
        
        System.out.println("Str "+str);
        
        boolean flag = false;
        String flagStr = String.valueOf(flag);//flag+"";
        System.out.println("FlagStr "+flag);
        
        System.out.println("ChartAt (0) "+str.charAt(0));
        
        char[] chars = new char[5];
        
        str.getChars(0, 5, chars, 0);
        for(char ch : chars)
        {
            System.out.println("Ch "+ch);
        }
        
        System.out.println("Apple".equalsIgnoreCase("apple"));
        
        String str3= "Hello";
        String str4= "ll";
        
        System.out.println("RegionMatch "+str3.regionMatches(2, str4, 0, 2));
    }
}
