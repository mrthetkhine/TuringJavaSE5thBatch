/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

/**
 *
 * @author macbook
 */
class DivisionByZeroException extends Exception
{
    DivisionByZeroException(String message)
    {
        super(message);
    }
    
}
public class Semantics {
    static int div(int a, int b) throws DivisionByZeroException
    {
        
        if(b==0)
        {
            throw new DivisionByZeroException("Divisor is zero");
        }
        return a/b;
        
    }
    static int method()
    {
        try
        {
            return div(10,0);
        }
        catch(DivisionByZeroException de)
        {
            return 10;
        }
        catch(Exception e)
        {
            //return 3;
            throw new RuntimeException("Rethrow");
        }
        finally
        {
            return 5;
        }
    }
    public static void main(String[] args) {
        int result = method();
        System.out.println("Result "+result);
    }
}
