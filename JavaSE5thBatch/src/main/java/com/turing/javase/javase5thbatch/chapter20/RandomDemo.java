/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Random;

/**
 *
 * @author macbook
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Random "+rand.nextDouble());
        for (int i = 0; i < 10; i++) {
            System.out.println("No "+  (5+rand.nextInt(46)));
        }
    }
}
