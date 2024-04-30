/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class FileDemo {
    static void showDir(File file)
    {
        if(file.isDirectory())
        {
            System.out.println("Directory ==> "+file.getAbsolutePath());
            File dirs[] = file.listFiles();
            for(File file2 : dirs)
            {
                showDir(file2);
            }
        }
        else
        {
            System.out.println("File "+file.getAbsolutePath());
        }
    }
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println("File "+file.getAbsolutePath());
        System.out.println("Name "+file.getName());
        System.out.println("Path "+file.getPath());
        System.out.println("Parent "+file.getParent());
        System.out.println("isExist "+file.exists());
        System.out.println("isDir "+file.isDirectory());
        System.out.println("isHidden "+file.isHidden());
        System.out.println("Last modified "+new Date(file.lastModified()));
        String dirs[] = file.list();
        for(String f : dirs)
        {
            System.out.println(f);
        }
        showDir(file);
    }
}
