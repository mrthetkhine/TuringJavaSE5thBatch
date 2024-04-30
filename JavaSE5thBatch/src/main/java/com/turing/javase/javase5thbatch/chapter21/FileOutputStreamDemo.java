/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author macbook
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("./../hello.txt");
        System.out.println("File "+file.getAbsolutePath());
        
        try(FileOutputStream fout = new FileOutputStream(file,true))
        {
            String str = "Hello World";
            byte[] bytes = str.getBytes();
            fout.write(bytes);
        }
        catch(IOException ie)
        {
            ie.printStackTrace();
        }
    }
}
