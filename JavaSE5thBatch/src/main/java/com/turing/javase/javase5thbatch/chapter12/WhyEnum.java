/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,
    Female
    
}

public class WhyEnum {
    public static void main(String[] args) {
        /*
        int gender= 0;
        gender = 1;
        
        System.out.println("Gender "+gender);
        */
        Gender gender = Gender.Female;
        //gender = 0;
        System.out.println("Gender "+gender);
        
        if(gender== Gender.Male)
        {
            System.out.println("Gender is male");
        }
        else if(gender == Gender.Female)
        {
            System.out.println("Gender is female");
        }
    }
}
