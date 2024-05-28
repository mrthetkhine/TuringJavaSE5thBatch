/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.solid;

import com.turing.javase.javase5thbatch.principle.di.Car;
import com.turing.javase.javase5thbatch.principle.di.Engine;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author macbook
 */
public class TestCar {
    
    
    @Test
    public void testCarStart()
    {
        Engine engine = Mockito.mock(Engine.class);
        Car car = new Car(engine);
        
        car.start();
        
        Mockito.verify(engine).start();
    }
}
