/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter22;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author macbook
 */
public class WriteWithChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("./../hello2.txt");
        
        int count;
        try(FileChannel fChan = 
                (FileChannel)Files.newByteChannel(path,
                            StandardOpenOption.WRITE,
                            StandardOpenOption.CREATE))
        {
            ByteBuffer buffer = ByteBuffer.allocate(52);
            char ch  ='A';
            for (int i = 0; i < 26; i++) {
                buffer.putChar(ch++);
            }
            buffer.rewind();
            fChan.write(buffer);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
