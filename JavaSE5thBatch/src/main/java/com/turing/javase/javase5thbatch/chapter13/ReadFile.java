/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("/Users/Project/Turing/Java/JavaSE5thBatch/demo.py")){    
            
            int ch;
            
            while( (ch=fin.read()) !=-1)
            {
                char c = (char)ch;
                System.out.print(c);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
