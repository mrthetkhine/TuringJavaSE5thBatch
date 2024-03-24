/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Button
{
    private String color;
    protected int width = 100;
    int height = 200;//package
    Button()
    {
        System.out.println("Button default constructor");
    }
    Button(String color)
    {
        this.color = color;
        System.out.println("Button constructor");
    }
    
    void paint()
    {
        System.out.println("Button paint with "+this.color);
    }
}
class Win95Button extends Button
{
    Win95Button()
    {
        System.out.println("Win95Button default constructor");
    }
    Win95Button(String color)
    {
        super(color);
        System.out.println("Win95 consturctor");
    }
    void paint()
    {
        super.paint();
        System.out.println("Win95Button paint "+this.width+" height "+height);
    }
}
class Win98Button extends Win95Button
{
    Win98Button(String color)
    {
        //super(color);
        System.out.println("Win98 consturctor");
    }
    void paint()
    {
        super.paint();    
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Button button = new Win98Button("blue");
        button.paint();
    }
}
