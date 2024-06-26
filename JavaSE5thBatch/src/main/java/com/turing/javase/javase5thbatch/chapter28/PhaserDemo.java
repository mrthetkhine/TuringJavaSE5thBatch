/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.Phaser;

/**
 *
 * @author macbook
 */
class MyThread extends Thread
{
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
    }
    
    
    public void run()
    {
        System.out.println("Thread "+this.name+" Arrived Phase One");
        this.phaser.arriveAndAwaitAdvance();
        
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread "+this.name+" Arrived Phase Two");
        this.phaser.arriveAndAwaitAdvance();
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread "+this.name+" Arrived Phase Three");
        this.phaser.arriveAndDeregister();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        
        System.out.println("Starting");
        new MyThread(phaser,"A").start();
        new MyThread(phaser,"B").start();
        new MyThread(phaser,"C").start();
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");
        
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");
        
        phaser.arriveAndDeregister();
    }
}
