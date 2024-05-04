/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataInputDemo {
    public static void main(String[] args) {
         File file = new File("./../demo.data");
         try(DataInputStream din =new DataInputStream(new FileInputStream(file)))
         {
            double first = din.readDouble();
            int second = din.readInt();
             System.out.println("First "+first+" second "+second);
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
    }
}
