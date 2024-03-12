/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 2; i <=5; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.println(i+" * "+j +" = "+ i*j);
            }
            System.out.println("==========");
        }
       
    }
}
