/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author macbook
 */
class OnlyExt implements FilenameFilter
{

    String extension;
    public OnlyExt(String ext)
    {
        this.extension= "."+ext;
    }
    @Override
    public boolean accept(File dir, String name) {
       return name.endsWith(this.extension);
    }
}
public class FileNameFilterDemo {
    public static void main(String[] args) {
        File dir = new File("./../");
        File newDir = new File("./../test");
        newDir.mkdir();
        System.out.println("Dir "+dir.getPath());
        File files[]= dir.listFiles(new OnlyExt("html"));
        
        for (File file : files) {
            System.out.println("File "+file);
        }
    }
}
