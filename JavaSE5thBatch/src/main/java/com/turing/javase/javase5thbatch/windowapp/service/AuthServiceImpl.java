/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.service;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.User;
import com.turing.javase.javase5thbatch.windowapp.dao.UserDao;
import com.turing.javase.javase5thbatch.windowapp.dao.impl.UserDaoImpl;

/**
 *
 * @author macbook
 */
public class AuthServiceImpl implements AuthService{

    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean login(String username, String password) {
        User user = userDao.getLoginUser(username, password);
        return user != null;
    }
    
}
