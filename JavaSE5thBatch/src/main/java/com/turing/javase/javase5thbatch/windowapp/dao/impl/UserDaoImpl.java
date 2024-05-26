/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.dao.impl;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.User;
import com.turing.javase.javase5thbatch.windowapp.dao.UserDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author macbook
 */
public class UserDaoImpl extends DAO implements UserDao {

    public UserDaoImpl()
    {
        super();
    }
    String salt = "#112";
    
    @Override
    public User getLoginUser(String username, String password) {
        String sql = "SELECT * FROM `user` " +
                    " WHERE username=? "+
                    " AND password=md5(?);";
        System.out.println("SQL "+sql);
        User user = null;
        boolean loginSuccess = false;
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setString(1, username);
            st.setString(2, password+salt);
            ResultSet res = st.executeQuery();
            while(res.next())
            {
                user = new User();
                user.setId(res.getLong("ID"));
                user.setUsername(res.getString("username"));
                
                loginSuccess= true;
                break;
            }
            res.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
    
}
