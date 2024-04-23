/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ExecuteProcess {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls -la");
            InputStream in = process.getInputStream();
            
            int data;
            while((data=in.read()) !=-1)
            {
                System.out.print((char)data);
            }
            in.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
