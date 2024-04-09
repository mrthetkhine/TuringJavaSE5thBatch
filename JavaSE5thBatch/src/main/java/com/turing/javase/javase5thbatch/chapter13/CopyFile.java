/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class CopyFile {
    public static void main(String[] args) {
        try (var fin = new FileInputStream("/Users/Project/Turing/Java/JavaSE5thBatch/demo.py");
             var fout = new FileOutputStream("/Users/Project/Turing/Java/JavaSE5thBatch/copy.py")){    
            
            int ch;
            
            while( (ch=fin.read()) !=-1)
            {
                char c = (char)ch;
                fout.write(ch);
                System.out.print(c);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
