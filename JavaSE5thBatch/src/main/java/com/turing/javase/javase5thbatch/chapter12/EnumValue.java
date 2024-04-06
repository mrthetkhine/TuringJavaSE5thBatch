/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Color
{
    Red,
    Green,
    Blue
}
public class EnumValue {
    public static void main(String[] args) {
        Color[] colors= Color.values();
        for(Color c : colors)
        {
            System.out.println("Color "+c);
        }
        Color redColor = Color.valueOf("Red");
        System.out.println("RedColor == Color.Red "+ (redColor== Color.Red));
    }
}
