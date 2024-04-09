/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter13;

import java.util.Date;

/**
 *
 * @author macbook
 */
class Human
{
}
class Teacher extends Human
{
}
public class InstanceOfDemo {
    public static void main(String[] args) {
        Object obj = "Hello";
        System.out.println("String instanceof String "+ ("" instanceof String));
        System.out.println("String instanceof Object "+ ("" instanceof Object));
        System.out.println("String instanceof Date "+ ( obj instanceof Date));
        
        obj = null;
        System.out.println("String instanceof Date "+ ( obj instanceof Object));
        
        Teacher t = new Teacher();
        System.out.println("T instanceof Teacher "+(t instanceof Teacher));
        System.out.println("T instanceof Human "+(t instanceof Human));
        System.out.println("T instanceof Object "+(t instanceof Object));
        
        obj = t;
        if(obj instanceof Teacher)
        {
            t = (Teacher)obj;
        }
    }
}
