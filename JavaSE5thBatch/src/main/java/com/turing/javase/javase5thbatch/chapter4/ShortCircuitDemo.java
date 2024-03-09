/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ShortCircuitDemo {
    static boolean getTrue()
    {
        System.out.println("GetTrue");
        return true;
    }
    static boolean getFalse()
    {
        System.out.println("GetFalse");
        return false;
    }
    public static void main(String[] args) {
        //boolean result = getTrue();
        //System.out.println("Result "+result);
        System.out.println("False && True "+( getFalse() && getTrue()));
        //System.out.println("False & True "+( getFalse() & getTrue()));
        
        System.out.println("False || True "+ (getFalse() || getTrue()));
        System.out.println("True || True "+ (getTrue() || getTrue()));
    }
}
