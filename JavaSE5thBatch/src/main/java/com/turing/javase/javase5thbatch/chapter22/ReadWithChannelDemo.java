/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter22;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author macbook
 */
public class ReadWithChannelDemo {
    public static void main(String[] args) {
        Path path = Path.of("./../demo.py");
        
        int count;
        try(SeekableByteChannel fChan = Files.newByteChannel(path))
        {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            
            do
            {
                count = fChan.read(buffer);
                //System.out.println("Count "+count);
                buffer.rewind();
                if(count != -1)
                {
                    
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)buffer.get());
                    }
                }
            }while( count != -1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
