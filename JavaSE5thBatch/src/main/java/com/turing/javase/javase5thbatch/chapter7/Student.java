/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Student {
    String name;
    static String headMaster;
    
    static {
        headMaster = "U Aung";
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
    public Student(String name)
    {
        this.name = name;
    }
    public void diplay()
    {
        System.out.println("Name "+this.name);
        System.out.println("HeadMaster "+headMaster);
    }
    static void staticMethod()
    {
        System.out.println("HeadMaster "+headMaster);
        //System.out.println("Name "+name);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("AA");
        Student s2 = new Student("BB");
        
        s1.headMaster = "U Hla";
        
        System.out.println("S1 "+s1.name+" headmaster "+s1.headMaster);
        System.out.println("S2 "+s2.name+" headmaster "+s2.headMaster);
    }
}
