/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter13;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class ReadConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num ");
        int data = scanner.nextInt();
        
        System.out.println("Data is "+data);
        
        System.out.println("Enter string line");
        String line = scanner.next();
        
        System.out.println("line is "+line);
    }
}
