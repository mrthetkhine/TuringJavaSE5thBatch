/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GStack<T> {
    
    int top = -1;
    T[] items;
    
    GStack()
    {
        this.items = (T[])new Object[10];
    }
    public void push(T value)
    {
        System.out.println("Value "+value.getClass());
        this.items[++this.top] = value;
    }
    public T pop()
    {
        return this.items[this.top--];
    }
    public static void main(String[] args) {
        GStack<Integer> iStack = new GStack<>();
        iStack.push(12);
        iStack.push(100);
        Object obj = "Hello";
        //iStack.push((Integer)obj);
        
        //Integer item = iStack.pop();
        System.out.println("Item "+iStack.pop());
        
        GStack<String> sStack = new GStack<>();
        sStack.push("Hello");
        sStack.push("World");
        
        System.out.println("Pop "+sStack.pop().toUpperCase());  
        
        System.out.println("Class "+ iStack.getClass());
        
        //GStack<int> iStack2 = new GStack<>();
    }
}
