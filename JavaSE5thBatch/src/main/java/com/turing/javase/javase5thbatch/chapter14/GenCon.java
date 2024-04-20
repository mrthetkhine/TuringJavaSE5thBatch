/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GenCon {
    private double value;
    <T extends Number> GenCon(T value)
    {
        this.value = value.doubleValue();
    }
    void showVal()
    {
        System.out.println("Value "+this.value);
    }
    public static void main(String[] args) {
        GenCon con1 = new GenCon(13);
        con1.showVal();
        
        GenCon con2 = new GenCon(14.0);
        con2.showVal();
    }
}
