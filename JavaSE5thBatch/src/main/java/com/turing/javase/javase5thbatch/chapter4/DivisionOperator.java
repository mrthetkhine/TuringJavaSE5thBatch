/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class DivisionOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("a / b "+(a/b));
        //System.out.println("2/0 "+(2 / 0));
        System.out.println("2/0.0 "+(2 / 0.0));
        
        double result = 0.0/0.0;
        System.out.println("Result "+result);
        System.out.println("Result == result "+(result==result));
        System.out.println("NaN+1 "+ (result+1));
        
        System.out.println("isNaN "+Double.isNaN(result));
    }
}
