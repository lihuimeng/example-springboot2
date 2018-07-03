package com.taimei.example.service;


import com.taimei.example.entry.Movie;

public interface MovieService {

    Long reduceCount(Long id);

    Movie findById(Long id);

    Long addMovie(Movie movie);
}
