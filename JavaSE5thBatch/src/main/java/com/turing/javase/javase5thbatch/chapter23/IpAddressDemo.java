/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class IpAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress[] ips = InetAddress.getAllByName("www.google.com");
            for(InetAddress ip:ips)
            {
                System.out.println("Ip "+ip);
            }
            System.out.println("Localhost "+InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
