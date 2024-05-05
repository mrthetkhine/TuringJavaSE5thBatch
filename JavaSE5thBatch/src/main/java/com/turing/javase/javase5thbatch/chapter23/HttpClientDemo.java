/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com",80);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String request= "GET /index.html HTTP/1.1\r\n\r\n";
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
