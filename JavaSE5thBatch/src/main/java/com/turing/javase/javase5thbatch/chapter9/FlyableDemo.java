/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter9;

/**
 *
 * @author macbook
 */

interface Flyable
{
    void fly();
}
interface Machine
{
    void start();
    void stop();
}
class Aeroplane implements Flyable, Machine
{

    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
  
}
class Bird implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
    
}
public class FlyableDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        
        flyable = new Aeroplane();
        flyable.fly();
    }
}
