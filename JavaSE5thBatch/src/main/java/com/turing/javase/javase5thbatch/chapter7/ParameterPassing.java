/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Data
{
    int value;
}
public class ParameterPassing {
    static void inc(Data para)
    {
        para.value ++;
    }
    static void inc2(Data para)
    {
        para = new Data();
        para.value = 100;
    }
    static void inc(int par)
    {
        par ++;
    }
    public static void main(String[] args) {
        int a = 10;
        inc(a); //par = a;
        System.out.println("A "+a);
        
        Data data = new Data();
        data.value= 10;
        inc(data);//para = data
        System.out.println("Value "+data.value);
        
        inc2(data);
        System.out.println("Value "+data.value);
    }
}
