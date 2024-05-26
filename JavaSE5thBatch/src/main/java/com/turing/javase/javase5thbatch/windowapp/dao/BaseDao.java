/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author macbook
 */
public class BaseDao {
    Connection conn;
    private static BaseDao singleton;
    static
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private BaseDao() {
        try
        {
            this.conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_5th", 
                                                        "root", "Root@3421C");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public Connection getConnection()
    {
        return this.conn;
    }
    public static BaseDao getInstance()
    {
        if(singleton == null)
        {
            singleton = new BaseDao();
        }
        return singleton;
    }
    public static void main(String[] args) {
        BaseDao dao = BaseDao.getInstance();
        BaseDao dao2 = BaseDao.getInstance();
        
        System.out.println("Dao "+(dao==dao2));
    }
}
