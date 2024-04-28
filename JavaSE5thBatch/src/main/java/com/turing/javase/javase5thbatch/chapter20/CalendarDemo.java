/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.Calendar;

/**
 *
 * @author macbook
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Date "+calendar.get(Calendar.DATE)); 
        System.out.println("Day of week  "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Month "+calendar.get(Calendar.MONTH));
    }
}
