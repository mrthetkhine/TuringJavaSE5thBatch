/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Box {
    private int width, height,depth;
    
    public Box(int width,int height, int depth)
    {
        System.out.println("Constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int getVolume()
    {
        return this.width * this.height * this.depth;
    }
}
