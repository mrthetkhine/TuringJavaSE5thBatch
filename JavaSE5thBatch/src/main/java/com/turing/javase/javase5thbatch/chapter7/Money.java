/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Money {
    private int value;
    
    public Money(int value)
    {
        this.value = value;
    }
    public Money add(Money b)
    {
        return new Money(this.value+b.value);
    }
    public Money subtract(Money b)
    {
        return new Money(this.value-b.value);
    }
    public String toString()
    {
        System.out.println("ToString called");
        return "Money[value="+value+"]";
    }
    public static void main(String[] args) {
        Money a = new Money(100);
        Money b= new Money(20);
        
        Money c = a.add(b);
        System.out.println("C "+c);
    }
}
