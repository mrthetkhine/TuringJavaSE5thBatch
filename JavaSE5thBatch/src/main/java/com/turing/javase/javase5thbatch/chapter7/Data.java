/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Data {
    int value;
    
    public Data(int value)
    {
        this.value = value;
    }
    public static void main(String[] args) {
        Data data1 = new Data(10);
        Data data2 = new Data(20);
        data1.value++;
        data2.value = 100;
        
        System.out.println("Data1 "+data1.value);
        System.out.println("Data2 "+data2.value);
    }
}
