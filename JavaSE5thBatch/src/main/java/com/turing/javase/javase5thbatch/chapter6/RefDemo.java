/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class RefDemo {
    public static void main(String[] args) {
        //Data data = new Data(100);
        int a = 10;
        int b ;
        b = a;//copy semantics
        a++;
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        Data obj = new Data(100);
        Data obj2;
        obj2 = obj;//reference semantics
        obj.value ++;
        
        System.out.println("Obj "+obj.value);
        System.out.println("Obj2.value "+obj2.value);
        
        obj2 = new Data(200);
        obj2.value ++;
        
        System.out.println("Obj "+obj.value);
        System.out.println("Obj2.value "+obj2.value);
    }
}
