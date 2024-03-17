/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class Account {
    private int balance;
    
    public void debit(int amount)
    {
        if(amount >0 && this.balance>= amount)
        {
            this.balance -= amount;
        }
        
    }
    public void credit(int amount)
    {
        if(amount >0)
        {
            this.balance += amount;
        }
        
    }
    public int getBalance()
    {
        return this.balance;
    }
    
}
