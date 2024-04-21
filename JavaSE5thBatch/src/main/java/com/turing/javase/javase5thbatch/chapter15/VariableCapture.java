/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Fun
{
    void fun();
            
}
public class VariableCapture {
    public static void main(String[] args) {
        final int a = 10;
        Fun fun = ()->{
            System.out.println("A is "+a);
            //a++;
        };
        //a++;
        fun.fun();
    }
}
