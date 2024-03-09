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
public class RelationalUsageDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;
        
        System.out.println("Enter number ");
        number = scanner.nextInt();
        
        /*
        if(number > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative or zero");
        }
        */
        String result = number >0 ?"Positive":"Negative Or zero ";
        System.out.println(result);
    }
}
