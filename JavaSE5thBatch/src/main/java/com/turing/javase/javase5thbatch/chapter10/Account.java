/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

import com.turing.javase.javase5thbatch.chapter6.*;

/**
 *
 * @author macbook
 */
class BusinessLogicException extends Exception
{
    BusinessLogicException(String message)
    {
        super(message);
    }
}
public class Account {
    private int balance;
    
    public void debit(int amount)throws BusinessLogicException
    {
        if(amount >0 && this.balance>= amount)
        {
            this.balance -= amount;
        }
        else
        {
            throw new BusinessLogicException("Invalid debit operation");
        }
        
    }
    public void credit(int amount)throws BusinessLogicException
    {
        if(amount >0)
        {
            this.balance += amount;
        }
        else
        {
            throw new BusinessLogicException("Invalid credit operation invalid amount");
        }
        
    }
    public int getBalance()
    {
        return this.balance;
    }
    
}
