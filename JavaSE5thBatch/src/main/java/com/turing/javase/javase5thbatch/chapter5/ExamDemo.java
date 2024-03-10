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
public class ExamDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myan,eng, math ;
        
        System.out.println("Enter myan mark ");
        myan = scanner.nextInt();
        
        System.out.println("Enter english ");
        eng = scanner.nextInt();
        
        System.out.println("Enter math ");
        math = scanner.nextInt();
        
        if(myan >= 40)
        {
            System.out.println("Myanmar Ok");
            if(eng >= 40)
            {
                System.out.println("Eng ok");
                if(math >= 40)
                {
                    System.out.println("Math ok");
                    System.out.println("Pass");
                }
                else
                {
                    System.out.println("Failed in math");
                }
            }
            else
            {
                System.out.println("Failed in english");
            }
        }
        else
        {
            System.out.println("Myanmar failed");
        }
    }
}
