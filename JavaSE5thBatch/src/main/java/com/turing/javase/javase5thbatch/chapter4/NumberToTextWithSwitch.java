/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class NumberToTextWithSwitch {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int number;
         System.out.println("Please enter number");
         number = scanner.nextInt();
         
        switch (number) {
            
            case 0:
            case 1:    
                System.out.println("Zero or 1");
                //int a=10;
                break;
            default:
                System.out.println("Others");
                break;
            case 2:
                System.out.println("Two");
                break;
            
        }
             
         
    }
}
