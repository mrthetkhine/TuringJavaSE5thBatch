/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface First
{
    void first();
}
interface Another
{
    void another();
}
interface Second extends First,Another
{
    void second();
}
class Concrete implements Second
{

    @Override
    public void second() {
        System.out.println("Second");
    }

    @Override
    public void first() {
        System.out.println("First");
    }

    @Override
    public void another() {
        System.out.println("Another");
    }
}
public class ExtendInterfaceDemo {
    public static void main(String[] args) {
        Second sec = new Concrete();
        sec.first();
        sec.second();
        sec.another();
    }
}
