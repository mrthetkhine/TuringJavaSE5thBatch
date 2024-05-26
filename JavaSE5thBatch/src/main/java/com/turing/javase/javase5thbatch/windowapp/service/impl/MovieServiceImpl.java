/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.service.impl;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Movie;
import com.turing.javase.javase5thbatch.windowapp.dao.MovieDao;
import com.turing.javase.javase5thbatch.windowapp.dao.impl.MovieDaoImpl;
import com.turing.javase.javase5thbatch.windowapp.service.MovieService;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MovieServiceImpl implements MovieService{
    MovieDao dao;

    public MovieServiceImpl() {
        this.dao = new MovieDaoImpl();
    }

    
    @Override
    public List<Movie> getAllMovie() {
        return this.dao.getAllMovie();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return this.dao.saveMovie(movie);
    }
}
