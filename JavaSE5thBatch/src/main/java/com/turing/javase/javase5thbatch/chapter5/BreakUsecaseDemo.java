/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class BreakUsecaseDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to search");
        
        int num = scanner.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)
            {
                System.out.println("Found at index "+i);
                //break;
                return;
            }
        }
        System.out.println("End of loop");
    }
}
