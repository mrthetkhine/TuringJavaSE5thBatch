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
public class NumberToText {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int number;
         System.out.println("Please enter number");
         number = scanner.nextInt();
         
         if(number==0)
         {
            System.out.println("Zero");
         }
         else if(number ==1)
         {
              System.out.println("One");
         }
         else if(number == 2)
         {
            System.out.println("Two");
         }
         else
         {
            System.out.println("Others");
         }
             
         
    }
}
