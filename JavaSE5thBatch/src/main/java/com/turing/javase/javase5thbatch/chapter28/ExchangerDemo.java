/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter28;

import java.util.concurrent.Exchanger;

/**
 *
 * @author macbook
 */
class StringProducer extends Thread
{
    String str;
    Exchanger<String> exchanger;

    public StringProducer(Exchanger<String> exchanger) {
        this.str = "";
        this.exchanger = exchanger;
    }
    
    
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += ch ++;
            }
            try
            {
                str = this.exchanger.exchange(str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class StringConsumer extends Thread
{
    String str;
    Exchanger<String> exchanger;

    public StringConsumer(Exchanger<String> exchanger) {
        this.str = "";
        this.exchanger = exchanger;
    }
    
    
    public void run()
    {
       
        for (int i = 0; i < 3; i++) {
            
            try
            {
                str = this.exchanger.exchange(new String());
                System.out.println("Received "+str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        var exchanger= new Exchanger<String>();
        var producer = new StringProducer(exchanger);
        var consumer = new StringConsumer(exchanger);
        
        consumer.start();
        producer.start();
    }
}
