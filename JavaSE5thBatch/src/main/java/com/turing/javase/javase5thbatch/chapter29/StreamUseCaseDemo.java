/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,
    Female
}
class Human
{
    String name;
    int age;
    Gender gender;
    
    Human(String name, int age,Gender gender)
    {
        this.name = name;
        this.age= age;
        this.gender= gender;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
}
public class StreamUseCaseDemo {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<Human>();
        
        list.add(new Human("Mya Mya",35,Gender.Female));
        list.add(new Human("Aung Aung",30,Gender.Male));
        list.add(new Human("Tint Tint",32,Gender.Female));
        list.add(new Human("Mg Mya",36,Gender.Male));
        
        Predicate<Human> isFemale =(obj)->obj.gender== Gender.Female;
        
        Optional<Human> result = list.stream()
                                 .filter(isFemale)
                                 .reduce((a,b)->{
                                     return a.age> b.age?b:a;
                                 });
        System.out.println("Youngest "+result.get());
    }
}
