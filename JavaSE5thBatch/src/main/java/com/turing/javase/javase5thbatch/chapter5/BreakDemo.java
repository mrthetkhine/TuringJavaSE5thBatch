/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i=0;
        for (; i < 10; i++) {
            if(i==5)
            {
                break;
            }
            System.out.println("I is "+i);
        }
        System.out.println("End of loop i=> "+i);
    }
}
