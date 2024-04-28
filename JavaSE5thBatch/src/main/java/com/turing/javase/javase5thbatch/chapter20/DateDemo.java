/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        long ms = date.getTime();
        System.out.println("Date "+date);
        System.out.println("Ms "+ms);
        
        Date date2 = new Date(ms);
        System.out.println("Date 2 "+date2);
        
        Date date3 = new Date(2024,4,28);
        System.out.println("Date3.after "+date3.after(date));
        
        
        System.out.println("Month "+date.getMonth());
    }
}
