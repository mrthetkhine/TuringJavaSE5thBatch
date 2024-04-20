/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class RawType {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hi");
        strList.add("Hello");
        
        ArrayList list = new ArrayList();
        list.add("Hi");
        list.add(122);
        
        System.out.println("List1 "+list.get(1));
    }
}
