/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author macbook
 */
class RequestProcessor extends Thread
{
    Socket client;
    
    RequestProcessor(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try(DataInputStream in = new DataInputStream(this.client.getInputStream());
            DataOutputStream out= new DataOutputStream(this.client.getOutputStream())    )
        {
            //method url http version.
            String statusLine = in.readLine();
            in.readLine();
            in.readLine();
            String str[] = statusLine.split(" ");
            String url = str[1];
            System.out.println("Url "+url);
            
            String body = "<html><h3>Hello World</h3></html>\r\n";
            String httpResponse = "HTTP/1.1 200 OK\r\n"
                    +"Content-Length:"+body.length()+"\r\n"
                    + "\r\n"
                    +body;
            System.out.println(httpResponse);
            out.writeBytes(httpResponse);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
        
public class HttpServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9000);
            System.out.println("HTTP Server started");
            while(true)
            {
                Socket client = server.accept();
                System.out.println("Get new connection");
                new RequestProcessor(client).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
