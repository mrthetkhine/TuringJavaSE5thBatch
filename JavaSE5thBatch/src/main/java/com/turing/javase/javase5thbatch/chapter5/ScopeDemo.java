/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int b = 100;
        if(true)
        {
            int a = 10;
            System.out.println(" A is "+a);
        }
        int a = 20;
        //System.out.println("A is "+a);
    }
}
