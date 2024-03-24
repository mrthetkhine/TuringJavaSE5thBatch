/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter8.nonpoly;

/**
 *
 * @author macbook
 */
class Teacher
{
    public void work()
    {
        System.out.println("Teacher work");
    }
}
class Doctor
{
    public void work()
    {
        System.out.println("Doctor work");
    }
}
public class WithoutPolymorphism {
    static void workEveryone(Object[] humans)
    {
        for (Object obj :humans) {
            if(obj instanceof Teacher)
            {
                Teacher t = (Teacher)obj;
                t.work();
            }
            else if(obj instanceof Doctor)
            {
                Doctor d = (Doctor)obj;
                d.work();
            }
        }
    }
    public static void main(String[] args) {
        Object[] humans = new Object[]{
            new Teacher(),
            new Doctor(),
        };
        workEveryone(humans);
        
    }
}
