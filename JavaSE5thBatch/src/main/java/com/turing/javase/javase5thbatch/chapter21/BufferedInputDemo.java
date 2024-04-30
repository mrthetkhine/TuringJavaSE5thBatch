/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class BufferedInputDemo {
    public static void main(String[] args) {
         File file = new File("./../demo.py");
         try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file)))
         {
             int data;
             bin.mark(0);
             while( (data=bin.read())!= -1)
             {
                 System.out.print((char)data);
             }
             //bin.
             bin.reset();
             while( (data=bin.read())!= -1)
             {
                 System.out.print((char)data);
             }
         }
         catch(IOException ie)
         {
             ie.printStackTrace();
         }
    }
}
