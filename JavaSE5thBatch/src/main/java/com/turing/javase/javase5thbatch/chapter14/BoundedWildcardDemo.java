/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter14;

/**
 *
 * @author macbook
 */
class TwoD
{
    int x,y;
    
    TwoD(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD
{
    int z;
    ThreeD(int x,int y, int z)
    {
        super(x,y);
        this.z= z;
    }
}
class FourD extends ThreeD
{
    int t;
    FourD(int x,int y,int z, int t)
    {
        super(x,y,z);
        this.t = t;
    }
}
class Coords<T extends TwoD>
{
    T[]coord;
    
    Coords(T[] data)
    {
        this.coord = data;
    }
    static void showXY(Coords<?> c)
    {
        System.out.println("XY coordinate");
        for (int i = 0; i < c.coord.length; i++) {
            System.out.println("X "+ c.coord[i].x+" Y "+c.coord[i].y);
        }
    }
    static void showXYZ(Coords<? extends ThreeD> c)
    {
        System.out.println("XY coordinate");
        for (int i = 0; i < c.coord.length; i++) {
            System.out.println("X "+ c.coord[i].x+" Y "+c.coord[i].y+" Z "+c.coord[i].z );
        }
    }
}
public class BoundedWildcardDemo {
    public static void main(String[] args) {
        ThreeD[] threeD = {
            new ThreeD(1,2,3),
            new ThreeD(4,5,6),
        };
        Coords<ThreeD> coords = new Coords<>(threeD);
        Coords.showXY(coords);
        Coords.showXYZ(coords);
        
    }
}
