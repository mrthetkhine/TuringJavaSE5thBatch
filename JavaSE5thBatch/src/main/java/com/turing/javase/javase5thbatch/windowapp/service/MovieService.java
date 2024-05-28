/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.service;

import com.turing.javase.javase5thbatch.chapter9.jdbc.model.Movie;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface MovieService {
    List<Movie> getAllMovie();
    Movie saveMovie(Movie movie);
    Movie updateMovie(Movie movie);
    void deleteMovieById(Long movieId);
}
