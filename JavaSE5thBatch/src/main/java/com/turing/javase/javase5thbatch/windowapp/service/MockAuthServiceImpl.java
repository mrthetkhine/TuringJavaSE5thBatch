/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.service;

/**
 *
 * @author macbook
 */
public class MockAuthServiceImpl implements AuthService{

    @Override
    public boolean login(String username, String password) {
        return (username.equals("admin") && password.equals("admin"));
       
    }
    
}
