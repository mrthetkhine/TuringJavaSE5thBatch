/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class FileInputDemo {
    public static void main(String[] args) {
        File file = new File("./../demo.py");
        System.out.println("File "+file.getAbsolutePath());
        
        try(FileInputStream fin = new FileInputStream(file))
        {
            int size = fin.available();
            int n = size/10;
            System.out.println("Available "+size);
            
            for (int i = 0; i < n; i++) {
                int data= fin.read();
                System.out.print((char)data);
            }
            fin.skip(5);
            byte[] b= new byte[n];
            if( fin.read(b) !=-1)
            {
                System.out.println("String "+new String(b));
            }
            //fin.
        }
        catch(IOException ie)
        {
            ie.printStackTrace();
        }
    }
}
