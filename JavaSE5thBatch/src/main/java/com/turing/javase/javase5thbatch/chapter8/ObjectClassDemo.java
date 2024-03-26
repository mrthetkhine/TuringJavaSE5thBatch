/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter8;

/**
 *
 * @author macbook
 */
public class ObjectClassDemo {
    void method()
    {
        System.out.println("ObjectClassDemo method");
    }
    public String toString()
    {
        return "ObjectClassDemo";
    }
    public static void main(String[] args) {
        Object obj = new ObjectClassDemo();
        System.out.println("Obj "+obj.toString());
        
        
    }
}
