/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class TriangleTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
