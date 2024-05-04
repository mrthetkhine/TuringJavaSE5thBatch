/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter22;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class MappChannelDemo {
    public static void main(String[] args) {
        try(FileChannel fChan = 
                (FileChannel)Files.newByteChannel(Path.of("./../demo.py")))
        {
            long size = fChan.size();
            MappedByteBuffer buffer = fChan.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for (int i = 0; i < size; i++) {
                System.out.print((char)buffer.get());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
