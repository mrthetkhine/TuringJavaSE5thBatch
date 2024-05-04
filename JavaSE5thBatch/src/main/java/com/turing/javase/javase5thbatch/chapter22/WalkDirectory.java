/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter22;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author macbook
 */
class MyFileVisitor extends SimpleFileVisitor<Path>
{
    public FileVisitResult visitFile(Path path,BasicFileAttributes attr)
    {
        System.out.println("Path "+path);
        return FileVisitResult.CONTINUE;
    }
}
public class WalkDirectory {
    public static void main(String[] args) {
        try
        {
            Files.walkFileTree(Path.of("./../"), new MyFileVisitor());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
