/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author macbook
 */

public class ObjOutputDemo {
    public static void main(String[] args) {
        MyData data = new MyData("Demo",300);
         File file = new File("./../object.data");
        try(ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oOut.writeObject(data);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
