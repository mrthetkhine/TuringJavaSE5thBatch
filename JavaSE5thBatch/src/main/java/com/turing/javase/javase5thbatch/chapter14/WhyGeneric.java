/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Stack
{
    int[]items;
    int top = -1;
    
    Stack()
    {
        this.items=new int[10];
    }
    public void push(int value)
    {
        this.items[++this.top] = value;
    }
    public int pop()
    {
        return this.items[this.top--];
    }
}
class GeneralStack
{
    Object[]items;
    int top = -1;
    
    GeneralStack()
    {
        this.items=new Object[10];
    }
    public void push(Object value)
    {
        this.items[++this.top] = value;
    }
    public Object pop()
    {
        return this.items[this.top--];
    }
}
public class WhyGeneric {
    public static void main(String[] args) {
        /*
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        
        System.out.println("Stack pop "+stack.pop());
        System.out.println("Stack pop "+stack.pop());
        */
        GeneralStack gStack = new GeneralStack();
        gStack.push(12);
        gStack.push(22);
        gStack.push("Hello");
        
        Integer item = (Integer)gStack.pop();
        System.out.println("Stack pop "+item);
        System.out.println("Stack pop "+gStack.pop());
    }
}
