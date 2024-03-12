/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class NestedBreak {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 10; i++) {
            System.out.println("I ==> "+i);
            for (int j = 0; j < 10; j++) {
                if(j==5)
                {
                    break outer;
                    //continue outer;
                }
                System.out.println("J => "+j);
                
            }
        }
        another:{
        }
        System.out.println("End of loop");
    }
}
