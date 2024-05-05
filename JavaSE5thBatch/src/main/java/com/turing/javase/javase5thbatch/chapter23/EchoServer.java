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
class EchoThread extends Thread
{
    Socket client;
    
    EchoThread(Socket client)
    {
        this.client = client;
    }
    public void run()
    {
        try(DataInputStream in = new DataInputStream(this.client.getInputStream());
            DataOutputStream out= new DataOutputStream(this.client.getOutputStream())    )
        {
            String data = in.readLine();
            String output = data+ new Date();
            
            out.writeUTF(output);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
        
public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9000);
            System.out.println("Server started");
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
