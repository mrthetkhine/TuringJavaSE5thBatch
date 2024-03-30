/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class AccountDemo {
    public static void main(String[] args) {
        try {
            Account account = new Account();
            //account.credit(-100);
            
            account.debit(20);
            System.out.println("Balance "+account.getBalance());
        } catch (BusinessLogicException ex) {
            System.out.println("Exception "+ex.getMessage());
            //ex.printStackTrace();
            StackTraceElement[] elements = ex.getStackTrace();
            for(var ele : elements)
            {
                System.out.println("Class "+ele.getClassName()
                        +" method "+ele.getMethodName()+" lineno "+ele.getLineNumber() );
            }
        }
    }
}
