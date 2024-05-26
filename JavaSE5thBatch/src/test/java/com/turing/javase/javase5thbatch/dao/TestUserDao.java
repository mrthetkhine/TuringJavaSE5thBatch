/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.dao;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.User;
import com.turing.javase.javase5thbatch.windowapp.dao.UserDao;
import com.turing.javase.javase5thbatch.windowapp.dao.impl.UserDaoImpl;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestUserDao {
    @Test
    public void testAdminIsOk()
    {
        //Arrage
        UserDao userDao = new UserDaoImpl();
        
        //Act
        User user = userDao.getLoginUser("admin", "admin");
        
        //Assert
        assertTrue(user!=null);
    }
    @Test
    public void testAdminWithWrongPassword()
    {
        //Arrage
        UserDao userDao = new UserDaoImpl();
        
        //Act
        User user = userDao.getLoginUser("admin", "dage");
        
        //Assert
        assertTrue(user==null);
    }
}
