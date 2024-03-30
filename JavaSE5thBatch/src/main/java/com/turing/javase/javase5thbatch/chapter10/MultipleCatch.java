/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class MultipleCatch {
    public static void main(String[] args) {
        
        try
        {
            String str = "";
            System.out.println("Str "+str.toUpperCase());

            int result = 10/20;
            System.out.println("Result "+result);
            
            int []arr =new int[2];
            arr[2]=10;
        }
        catch(NullPointerException | ArithmeticException ae)
        {
            System.out.println("Ne or AEhappened "+ae.getMessage());
        }
        /*
        catch(ArithmeticException ae)
        {
            System.out.println("AE happened "+ae.getMessage());
        }*/
        catch(Exception e)
        {
            System.out.println("Exception happened"+e.getMessage());
        }
    }
}
