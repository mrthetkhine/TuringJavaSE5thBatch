/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class PathDemo {
    public static void main(String[] args) {
        try {
            Path path = Path.of("./../hello2.txt");
            System.out.println("Abs "+path.getFileName());
            System.out.println("Root "+path.getRoot());
            
            System.out.println("File exists "+Files.exists(path));
            System.out.println("File hidden "+Files.isHidden(path));
            System.out.println("File readable "+Files.isReadable(path));
            System.out.println("File writable "+Files.isWritable(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
