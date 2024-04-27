/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter19;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("Two");
        queue.add("Three");
        
        System.out.println("Peek "+queue.peek());
        System.out.println("Take "+queue.poll());
        //System.out.println("Take "+queue.poll());
        //System.out.println("Take "+queue.poll());
        
        System.out.println("Contain "+queue.contains("Two"));
    }
}
