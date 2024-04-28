/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.BitSet;

/**
 *
 * @author macbook
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(3);
        
        bitSet.set(1);
        bitSet.set(2);
        
        BitSet bitSet2 = new BitSet(3);
       
        bitSet2.set(2);
        
        System.out.println("BitSet "+bitSet);
        bitSet.and(bitSet2);
        System.out.println("And "+bitSet);
    }
}
