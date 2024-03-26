/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter9;

/**
 *
 * @author macbook
 */
class Keyboard implements USB
{

    @Override
    public void read() {
        System.out.println("Keyboard read");
    }

    @Override
    public void write() {
        System.out.println("Keyboard write");
    }
}
class Mouse implements USB
{

    @Override
    public void read() {
        System.out.println("Mouse read");
    }

    @Override
    public void write() {
        System.out.println("Mouse write");
    }
}
abstract class Monitor implements USB
{

    @Override
    public void read() {
        System.out.println("Mouse read");
    }
    
}
public class InteraceDemo {
    public static void main(String[] args) {
        USB usb = new Keyboard();
        usb.read();
        usb.write();
        
        usb = new Mouse();
        usb.read();
        usb.write();
    }
}
