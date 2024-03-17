/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Data
{
    int balance;
}
public class ImperativeDemo {
    public static void debit(Data data,int amount)
    {
        data.balance -= amount;
    }
    public static void credit(Data data,int amount)
    {
        data.balance += amount;
    }
    public static void main(String[] args) {
       Data myaMyaAcc = new Data();
       Data aungAungAcc = new Data();
       
       credit(myaMyaAcc,200);
       debit(aungAungAcc,100);
       
       myaMyaAcc.balance = 0;
       
       System.out.println("MyaMya Account "+myaMyaAcc.balance);
       System.out.println("AungAung Account "+aungAungAcc.balance);
       
    }
    
}
