/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Stack {
    
    private int []items;
    private int top = -1;
    
    public Stack(int size)
    {
        this.items =new int[size];
    }
    public void push(int element)
    {
        if(top<this.items.length-1)
        {
            this.items[++top] = element;
        }
        
    }
    public int pop()
    {
        if(top >=0)
        {
            return this.items[top--];
        }
        else
        {
            return -1;
        }
        
    }
    
    
}
