/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.dao.impl;

import com.turing.javase.javase5thbatch.windowapp.dao.BaseDao;
import java.sql.Connection;

/**
 *
 * @author macbook
 */
public class DAO {
    Connection conn;

    public DAO() {
        this.conn = BaseDao.getInstance().getConnection();
    }
    
}
