/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        
        Stack stack2 = new Stack(20);
        stack2.push(100);
        stack2.push(200);
        
        stack2.push(300);
        System.out.println("Stack2.Pop "+stack2.pop());
    }
}
