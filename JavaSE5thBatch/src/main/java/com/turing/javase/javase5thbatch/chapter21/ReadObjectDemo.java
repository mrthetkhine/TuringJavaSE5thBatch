/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macbook
 */
public class ReadObjectDemo {
    public static void main(String[] args) {
        File file = new File("./../object.data");
        try(ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(file)))
        {
            MyData data = (MyData) oIn.readObject();
            System.out.println("Data "+data.name+" Age "+data.age);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
