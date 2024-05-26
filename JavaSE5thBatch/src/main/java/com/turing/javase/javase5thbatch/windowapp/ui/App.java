/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.windowapp.ui;

import com.turing.javase.javase5thbatch.windowapp.service.AuthService;
import com.turing.javase.javase5thbatch.windowapp.service.AuthServiceImpl;
import com.turing.javase.javase5thbatch.windowapp.service.MockAuthServiceImpl;
import com.turing.javase.javase5thbatch.windowapp.service.MovieService;
import com.turing.javase.javase5thbatch.windowapp.service.impl.MovieServiceImpl;

/**
 *
 * @author macbook
 */
public class App {
    
    
    private static App singleton;
    
    private MovieService movieService;
    private AuthService authService;
    private App()
    {
        this.movieService= new MovieServiceImpl();
        this.authService = new AuthServiceImpl();
    }
    public static App getInstance()
    {
        if(singleton == null)
        {
            singleton = new App();
        }
        return singleton;
    }

    public MovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public AuthService getAuthService() {
        return authService;
    }

    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }
    
}
