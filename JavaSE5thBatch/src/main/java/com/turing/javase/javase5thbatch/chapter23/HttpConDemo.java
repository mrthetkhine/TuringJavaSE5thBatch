/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class HttpConDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println("Protocol "+url.getProtocol());
            System.out.println("Port "+url.getPort());
            System.out.println("Host "+url.getHost());
            System.out.println("Filename "+url.getFile());
            
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            InputStream in = con.getInputStream();
            int ch;
            
            System.out.println("Request mehtod "+con.getRequestMethod());
            System.out.println("Response code "+con.getResponseCode());
            Map<String,List<String>> headers = con.getHeaderFields();
            Set<String> hrField = headers.keySet();
            
            for (String field: hrField) {
                System.out.println("Header "+field+ ": "+headers.get(field));
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
