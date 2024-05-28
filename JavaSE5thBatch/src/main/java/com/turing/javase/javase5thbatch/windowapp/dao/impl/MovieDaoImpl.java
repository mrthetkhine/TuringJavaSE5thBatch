/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.dao.impl;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Movie;
import com.turing.javase.javase5thbatch.windowapp.dao.BaseDao;
import com.turing.javase.javase5thbatch.windowapp.dao.MovieDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MovieDaoImpl extends DAO implements MovieDao{
   

    public MovieDaoImpl() {
        super();
    }
    

    @Override
    public List<Movie> getAllMovie() {
        ArrayList<Movie> movies= new ArrayList<>();
       
        try(Statement st = this.conn.createStatement())
        {
            ResultSet res = st.executeQuery("SELECT * FROM movie;");
            while(res.next())
            {
                Movie movie = new Movie();
                
                movie.setId(res.getLong("ID"));
                movie.setTitle(res.getString("title"));
                movie.setGenre(res.getString("genre"));
                movie.setYear(res.getInt("year"));
                
                movies.add(movie);
            }
            res.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        int row=0;
        try(Statement st = this.conn.createStatement())
        {
            String sql = "INSERT INTO movie(title,genre,year)"
                    + " VALUES (\""+movie.getTitle()+"\",\""+movie.getGenre()+"\","+movie.getYear()+" );";
            System.out.println("SQL "+sql);
            row = st.executeUpdate(sql);
            String query = "SELECT LAST_INSERT_ID();";
            try(PreparedStatement queryStmt = this.conn.prepareStatement(query))
            {
                ResultSet result = queryStmt.executeQuery();
                if(result.next())
                {
                    Long id = result.getLong(1);
                    movie.setId(id);
                }
                result.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movie;
    }

    @Override
    public Movie updateMovie(Movie movie) {
        int row=0;
        String sql = "UPDATE movie "+
                      "SET title=?,"+
                        " genre=?,"+
                       " year=? "+
                       " WHERE ID=?;";
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setString(1,movie.getTitle());
            st.setString(2,movie.getGenre());
            st.setInt(3, movie.getYear());
            st.setLong(4, movie.getId());
            
            System.out.println("SQL "+sql);
            row = st.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movie;
    }

    @Override
    public void deleteMovieById(Long id) {
        String sql = "DELETE FROM movie "+
                       " WHERE ID=?;";
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setLong(1,id);
           
            System.out.println("SQL "+sql);
            st.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }
    
}
