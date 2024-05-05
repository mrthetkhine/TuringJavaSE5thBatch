/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UrlDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println("Protocol "+url.getProtocol());
            System.out.println("Port "+url.getPort());
            System.out.println("Host "+url.getHost());
            System.out.println("Filename "+url.getFile());
            
            URLConnection con = url.openConnection();
            InputStream in = con.getInputStream();
            int ch;
            
            while( (ch=in.read())!=-1)
            {
                System.out.print((char)ch);
            }
            in.close();
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
