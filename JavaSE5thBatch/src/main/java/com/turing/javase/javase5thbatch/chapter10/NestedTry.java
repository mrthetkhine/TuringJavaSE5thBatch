/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class NestedTry {
    public static void main(String[] args) {
        
        try
        {
            double result = 12/0.0;
            System.out.println("Result "+result);
            try
            {
                System.out.println("Code inside inner try");
                String str= null;
                System.out.println("Uppercase "+str.toUpperCase());
            }
            catch(ArithmeticException e)
            {
                System.out.println("Inner level exception "+e.getLocalizedMessage());
            }
            catch(Exception e)
            {
                System.out.println("Inner level exception "+e.getMessage());
            }
            System.out.println("Code end of inner try");
        }
        catch(Exception e)
        {
            System.out.println("Outer level exception "+e.getMessage());
        }
    }
}
