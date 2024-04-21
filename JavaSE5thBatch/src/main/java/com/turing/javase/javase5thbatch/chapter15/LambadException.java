/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
interface DoubleNumericArrayFunc
{
    double func(double[] value)throws EmptyArrayException;
}
class EmptyArrayException extends Exception
{

    public EmptyArrayException() {
        super("Empty array");
    }
    
}
public class LambadException {
    public static void main(String[] args) {
        double [] values = {1.0,2.0,3.0};
        DoubleNumericArrayFunc doubleNumeric = (double[]vals)->{
          double sum=0;
          if(vals.length==0)
          {
              throw new EmptyArrayException();
          }
          else
          {
              for(Double d :vals)
              {
                  sum+=d;
              }
          }
          return sum;
        };
        try {
            double empty[]={};
            System.out.println("Sum "+doubleNumeric.func(empty));
        } catch (EmptyArrayException ex) {
            ex.printStackTrace();
        }
    }
}
