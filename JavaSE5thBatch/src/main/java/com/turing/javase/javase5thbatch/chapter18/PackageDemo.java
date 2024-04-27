/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class PackageDemo {
    public static void main(String[] args) {
        Package packages[] = Package.getPackages();
        for(Package pack : packages)
        {
            System.out.println("Pack "+pack);    
        }
        Module module = PackageDemo.class.getModule();
        System.out.println("Module "+module.getName());
    }
}
