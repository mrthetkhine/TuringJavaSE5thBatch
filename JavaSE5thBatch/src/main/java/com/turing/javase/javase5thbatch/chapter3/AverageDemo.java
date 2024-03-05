/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class AverageDemo {
    public static void main(String[] args) {
        int arr[]={10,2,3,4,7};
        int total =0;
        for (int i : arr) {
            System.out.println("I "+i);
            total += i;
        }
        System.out.println("Average "+total/arr.length);
    }
}
