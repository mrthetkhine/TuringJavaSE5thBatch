/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ExceptionDemo {
    
    static int div(int a, int b) throws Exception
    {
        
        if(b==0)
        {
            throw new Exception("Divisor is zero");
        }
        return a/b;
        
    }
    public static void main(String[] args) {
  
        try
        {
            int result = div(10,5);
            System.out.println("Result "+result);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("AE happened "+ae.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception happened "+e.getMessage());
            //e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally executed");
        }
        
        System.out.println("End of code");
       
    }
}
