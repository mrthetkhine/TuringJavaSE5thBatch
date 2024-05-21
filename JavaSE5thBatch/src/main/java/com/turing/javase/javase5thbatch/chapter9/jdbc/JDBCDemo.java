/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter9.jdbc;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Actor;
import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Director;
import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Movie;
import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Tuple;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
/*
salt = #112
*/
public class JDBCDemo {
    Connection conn;
    static
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public JDBCDemo() {
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
    boolean safeLogin(String username,String password)
    {
        String salt = "#112";
        String sql = "SELECT * FROM `user` " +
                    " WHERE username=? "+
                    " AND password=md5(?);";
        System.out.println("SQL "+sql);
        boolean loginSuccess = false;
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setString(1, username);
            st.setString(2, password+salt);
            ResultSet res = st.executeQuery();
            while(res.next())
            {
                loginSuccess= true;
                break;
            }
            res.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return loginSuccess;
    }
    //Do not use, code is to demostrate injection attack
    boolean login(String username,String password)
    {
        String salt = "#112";
        String sql = "SELECT * FROM user " +
                    " WHERE username=\""+username +"\""+
                    "  AND password=md5(\""+(password+salt)+"\");";
        System.out.println("SQL "+sql);
        boolean loginSuccess = false;
        try(Statement st = this.conn.createStatement())
        {
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                loginSuccess= true;
                break;
            }
            res.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return loginSuccess;
    }
    ArrayList<Movie> getAllMovie()
    {
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
    ArrayList<Tuple<Movie,Actor>> getAllActorInMovie()
    {
        ArrayList<Tuple<Movie,Actor>> data= new ArrayList<>();
        try(Statement st = this.conn.createStatement())
        {
            ResultSet res = st.executeQuery("SELECT movie.id as movie_id,movie.title,movie.genre,movie.year,actor.id as actor_id,actor.name FROM movie\n" +
"INNER JOIN movie_actor\n" +
"INNER JOIN actor\n" +
"ON movie.id= movie_actor.movie_id\n" +
"AND movie_actor.actor_id= actor.id;");
            while(res.next())
            {
                Tuple<Movie,Actor> tuple = new Tuple<>();
                Movie movie = new Movie();
                
                movie.setId(res.getLong("movie_id"));
                movie.setTitle(res.getString("title"));
                movie.setGenre(res.getString("genre"));
                movie.setYear(res.getInt("year"));
                
                Actor actor =new Actor();
                actor.setId(res.getLong("actor_id"));
                actor.setName(res.getString("name"));
                
                tuple.setFirst(movie);
                tuple.setSecond(actor);
                data.add(tuple);
            }
            res.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;
            
    }
    int insertMovie(Movie movie)
    {
        int row=0;
        try(Statement st = this.conn.createStatement())
        {
            String sql = "INSERT INTO movie(title,genre,year)"
                    + " VALUES (\""+movie.getTitle()+"\",\""+movie.getGenre()+"\","+movie.getYear()+" );";
            System.out.println("SQL "+sql);
            row = st.executeUpdate(sql);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return row;
    }
    int updateMovie(Movie movie)
    {
        int row=0;
         String sql = "UPDATE movie "
                 + " SET title=?,"
                 + "  genre=?,"
                 + "  `year`=? "
                 + " WHERE id=?";
         
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setString(1, movie.getTitle());
            st.setString(2,movie.getGenre());
            st.setInt(3,movie.getYear());
            st.setLong(4, movie.getId());
            System.out.println("SQL "+sql);
            row = st.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return row;
    }
    int deleteMovie(Long movieId)
    {
        int row=0;
        String sql = "DELETE FROM movie WHERE id=?";
        try(PreparedStatement st = this.conn.prepareStatement(sql))
        {
            st.setLong(1, movieId);
            System.out.println("SQL "+sql);
            row = st.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return row;
    }
    public static void main(String[] args) {
        JDBCDemo dao = new JDBCDemo();
        
        /*
        Movie movie = new Movie();
        movie.setId(7L);
        movie.setTitle("Test movie1");
        movie.setGenre("Drama");
        movie.setYear(2024);
        dao.updateMovie(movie);
        
        
        //dao.deleteMovie(8L);
        List<Movie> movies = dao.getAllMovie();
        movies.forEach(System.out::println);
        
        //System.out.println("Login "+dao.login("admin\" OR 1;#", ""));
        System.out.println("Login "+dao.safeLogin("admin\" OR 1;#", ""));
        //System.out.println("Login "+dao.safeLogin("admin","admin"));
        */
        ArrayList<Tuple<Movie,Actor>> data = dao.getAllActorInMovie();
        
        for(Tuple<Movie,Actor> item :data)
        {
            System.out.println("Movie "+item.getFirst() + " Actor "+item.getSecond());
        }
        
        ArrayList<Tuple<Tuple<Movie,Director>,Actor>> items = new ArrayList<>();
    }
}
