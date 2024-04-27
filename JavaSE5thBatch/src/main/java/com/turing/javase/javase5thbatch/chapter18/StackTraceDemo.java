/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class StackTraceDemo {
    static void method2()
    {
      StackTraceElement elements[] = Thread.currentThread().getStackTrace();
      for(StackTraceElement element: elements)
            {
                System.out.println(element.getClassName()
                        +" File "+element.getFileName()
                        +"Method "+element.getMethodName()
                        +" Line "+element.getLineNumber());
            }
    }
    static void method1()
    {
        method2();
    }
    public static void main(String[] args) {
        try
        {
            throw new Exception("Some exeception");
        }
        catch(Exception e)
        {
            StackTraceElement elements[] = e.getStackTrace();
            for(StackTraceElement element: elements)
            {
                System.out.println(element.getClassName()
                        +" File "+element.getFileName()
                        +"Method "+element.getMethodName()
                        +" Line "+element.getLineNumber());
            }
        }
        method1();
    }
}
