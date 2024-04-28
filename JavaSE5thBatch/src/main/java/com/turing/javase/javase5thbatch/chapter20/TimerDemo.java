/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author macbook
 */
class MyTask extends TimerTask
{

    @Override
    public void run() {
        System.out.println("MyTask executed");
    }
}
public class TimerDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, 5000,2000);
        System.out.println("End");
    }
    
}
