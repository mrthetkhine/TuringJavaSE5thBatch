/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class MultiDimArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5}, //row 0
            {6,7,8,9,10,22,33,44}, //row 1
            {11,12,13,14,15}
        };
        System.out.println("Arr.length "+arr.length);
        System.out.println("Row 1 "+arr[1][1]);
        System.out.println("Arr[2][2] "+arr[2][2]);
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Arr["+i+"]["+j+"] = "+arr[i][j]);
            }
        }
    }
}
