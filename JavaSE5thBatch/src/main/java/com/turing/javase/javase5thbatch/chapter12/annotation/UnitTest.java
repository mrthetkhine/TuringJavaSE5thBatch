/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UnitTest {
    static void runTestCase(Object obj)
    {
        Method[] methods = obj.getClass().getDeclaredMethods();
        
        for(Method method : methods)
        {
            
            if(method.isAnnotationPresent(MyTest.class))
            {
                try {
                        method.invoke(obj, null);
                    } catch (Exception  ex) {
                        ex.printStackTrace();
                    } 
            }
            
            /*
            Annotation anno[]=method.getAnnotations();
            for(Annotation an :anno)
            {
                if(an instanceof MyTest)
                {
                    //System.out.println("Name "+method.getName());
                    
                }
                
            }*/
            
        }
    }
    public static void main(String[] args) {
        //TestCase obj = new TestCase();
        Object obj = new AnotherTestCase();
        runTestCase(obj);
        
    }
}
