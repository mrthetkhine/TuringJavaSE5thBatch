/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter20;

import java.util.UUID;

/**
 *
 * @author macbook
 */
public class UniqueIdDemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID "+uuid);
    }
}
