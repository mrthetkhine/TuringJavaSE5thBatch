/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UdpClient {
    public static void main(String[] args) {
        try {
            String data = "Hello from client "+Math.random();
            
            InetAddress localhost = InetAddress.getLocalHost();
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,localhost,9001);
            socket.send(packet);
            
            packet = new DatagramPacket(new byte[1024],1024);
            socket.receive(packet);
            
            System.out.println("Received "+new String(packet.getData()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
