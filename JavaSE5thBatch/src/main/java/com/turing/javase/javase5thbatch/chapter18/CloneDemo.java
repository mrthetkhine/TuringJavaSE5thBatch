/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
class Data implements Cloneable
{
    int value; 
    Data(int value)
    {
        this.value = value;
    }
    //@Override
    Data copy()
    {
        try
        {
            return (Data)super.clone();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
public class CloneDemo {
    public static void main(String[] args) {
        Data data = new Data(100);
        Data obj2 = data.copy();
        
        System.out.println("Obj2.value "+obj2.value);
        System.out.println("data == obj2 "+(data==obj2));
        Class<?> clazz = obj2.getClass();
        System.out.println("Class "+clazz.getName());  
        
        //System.out.println("Super "+obj2.getSuperclass());
        
    }
}
