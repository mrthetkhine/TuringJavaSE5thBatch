/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12.annotation;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class Human {
    @NotNull
    public String name;
    
    @NotNull(message="Please don't use null for address")
    public String address;
    
    public Date birthDay;
}
