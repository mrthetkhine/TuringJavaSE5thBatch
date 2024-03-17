/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter6;

/**
 *
 * @author macbook
 */
public class AccountDemo {
    public static void main(String[] args) {
        Account myaMyaAcc = new Account();
        Account hlaHlaAcc = new Account();
        
        myaMyaAcc.credit(200);
        myaMyaAcc.debit(100);
        
        hlaHlaAcc.debit(-500);//invalid
        hlaHlaAcc.credit(-300);
        
        //myaMyaAcc.balance = 0;
        
        System.out.println("Mya Mya Balance "+myaMyaAcc.getBalance());
        System.out.println("Hla Hla Balance "+hlaHlaAcc.getBalance());
    }
}
