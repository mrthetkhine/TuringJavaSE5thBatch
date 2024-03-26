/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface IOne
{
    int getNum();
    default String getString()
    {
        return "Hello";
    }
    static void staticMethod()
    {
        System.out.println("Static method");
    }
}
class One implements IOne
{

    @Override
    public int getNum() {
        return 100;
    }
    public String getString()
    {
        return "One";
    }
    
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        IOne one = new One();
        System.out.println("getNum "+one.getNum());
        System.out.println("GetStr "+one.getString());
        
        IOne.staticMethod();
    }
}
