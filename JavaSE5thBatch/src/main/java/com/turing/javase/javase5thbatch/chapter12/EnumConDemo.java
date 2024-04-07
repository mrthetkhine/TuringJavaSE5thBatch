/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Size
{
    Small(1),Medium(2),Large(3),XL(4);
    private int value;
    Size(int value)
    {
        this.value = value;
    }
    int getValue()
    {
        return value;
    }
}
public class EnumConDemo {
    public static void main(String[] args) {
        Size s1 = Size.Medium;
        Size s2 = Size.Large;
        
        if(s2.getValue() > s1.getValue())
        {
            System.out.println("Large > Medium");
        }
        System.out.println("Small poisition "+Size.Small.ordinal());
        System.out.println("Medium poisition "+Size.Medium.ordinal());
        System.out.println("Compare to "+ Size.Medium.compareTo(Size.Small));
    }
}
