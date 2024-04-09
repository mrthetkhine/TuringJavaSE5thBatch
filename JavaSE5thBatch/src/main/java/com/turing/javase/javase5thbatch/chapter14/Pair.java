/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class Pair<T,U> {
    T first;
    U second;
    Pair(T first,U second)
    {
        this.first= first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    public static void main(String[] args) {
        Pair<Integer,String>  idName = new Pair(1,"One");
        System.out.println("ID "+idName.getFirst()+ " name "+idName.getSecond());    
    }
}
