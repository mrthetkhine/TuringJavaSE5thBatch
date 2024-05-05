/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UdpServer {
    public static void main(String[] args) {
        int buffer_size = 1024;
        try {
            DatagramSocket socket = new DatagramSocket(9001);
            System.out.println("Server started");
            byte[] buffer = new byte[buffer_size];
            while(true)
            {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Server get "+received);  
                
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                String response = "Response from server "+new Date();
                packet = new DatagramPacket(response.getBytes(), response.getBytes().length, address, port);
                     
                
                socket.send(packet);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
