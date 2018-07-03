package com.taimei.example.service;


import com.taimei.example.entry.Movie;

import java.util.List;

public interface MovieService {

    Long reduceCount(Long id);

    Movie findById(Long id);

    Long addMovie(Movie movie);

    List<Movie> getMovieList(Movie movie);
}
