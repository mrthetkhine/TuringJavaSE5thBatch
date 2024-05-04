/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author macbook
 */
public class DataOutuptDemo {
    public static void main(String[] args) {
         File file = new File("./../demo.data");
         try(DataOutputStream dout =new DataOutputStream(new FileOutputStream(file)))
         {
            dout.writeDouble(3.14);
            dout.writeInt(1000);
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
    }
}
