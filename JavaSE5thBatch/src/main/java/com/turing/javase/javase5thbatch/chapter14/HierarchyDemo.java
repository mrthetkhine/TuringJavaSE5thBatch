/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Gen<T>
{
    T obj;
    Gen(T obj)
    {
        this.obj =obj;
    }
    T getKey()
    {
        return this.obj;
    }
}
class Gen2<T,V> extends Gen<T>
{
    V value;
    Gen2(T obj,V value)
    {
        super(obj);
        this.value = value;
    }
    
    V getValue()
    {
        return this.value;
    }
}
public class HierarchyDemo {
    public static void main(String[] args) {
        Gen2<String,Integer> pair = new Gen2<>("Key",100);
        System.out.println("Key "+pair.getKey()+ " value "+pair.getValue());
        
        Gen<String> strVer = new Gen("Hello");
        if( strVer instanceof Gen)
        {
            System.out.println("strVersion is Gen ");
        }
        if(strVer.getKey() instanceof String)
        {
            System.out.println("It is string");
        }
        
        var doubleVer = new Gen<Double>(3.0);
        //Gen<Object> intVer = doubleVer;
    }
}
