/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class MathDemo {
    static double degreeToRadian(double degree)
    {
        return Math.PI/180*degree;
    }
    public static void main(String[] args) {
        System.out.println("Max "+Math.max(10, 6));
        System.out.println("Sin(90) "+Math.sin(Math.toRadians(90)));
        
        System.out.println("Abs "+Math.abs(-1.3));
        System.out.println("Floor "+Math.floor(1.9));
        System.out.println("Ceiling "+Math.ceil(1.9));
    }
}
