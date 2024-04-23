/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter17;

/**
 *
 * @author macbook
 */
public class StringAPI2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("IndexOf "+ str.indexOf("Wo"));
        System.out.println("IndexOf "+ str.indexOf("Wolf"));
        
        System.out.println("LastIndexOf "+str.lastIndexOf("o"));
        
        System.out.println("Substring(1,4) "+ str.substring(1, 4));
        
        String str2 = str.replaceAll("ll", "LL");
        System.out.println("Str2 "+str);
        System.out.println("Str "+str2);
        
        String result = String.join(":", "Hello","World","Java");
        System.out.println("Result "+result);
    }
}
