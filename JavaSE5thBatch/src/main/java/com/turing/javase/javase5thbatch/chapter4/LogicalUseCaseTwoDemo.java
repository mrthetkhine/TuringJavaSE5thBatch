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
public class LogicalUseCaseTwoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myan,eng, math ;
        
        System.out.println("Enter myan mark ");
        myan = scanner.nextInt();
        
        System.out.println("Enter english ");
        eng = scanner.nextInt();
        
        System.out.println("Enter math ");
        math = scanner.nextInt();
        
        if( myan >= 40 && eng >= 40 && math >=40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
