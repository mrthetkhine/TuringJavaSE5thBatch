/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author macbook
 */
public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",9000);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String request= "Hello"+Math.random()+"\r\n";
            out.write(request.getBytes());
            
            int ch;
            while( (ch=in.read())!=-1)
            {
                System.out.print((char)ch);
            }
            out.close();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
