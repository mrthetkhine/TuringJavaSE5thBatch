/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Calendar;
import java.util.Formatter;

/**
 *
 * @author macbook
 */
public class FormatterDemo {
    public static void main(String[] args) {
        Formatter fmt= new Formatter();
        fmt.format("Formatting %s is easy %d %.2f", "with Java", 10, 98.64475);
        System.out.println("Fmt "+fmt);
        
        Formatter fmt2 = new Formatter();
        Calendar calendar = Calendar.getInstance();
        fmt2.format("%tr",calendar);
        
        System.out.println(fmt2);
        
        fmt2 = new Formatter();
        fmt2.format("|%-+12f|%n|%,.2f|", -98.102293,89188.0);
        System.out.println(fmt2);
    }
}
