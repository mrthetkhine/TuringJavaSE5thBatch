/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

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
    }
}
