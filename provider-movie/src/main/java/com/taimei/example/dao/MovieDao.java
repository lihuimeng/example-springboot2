package com.taimei.example.dao;

import com.taimei.example.entry.Movie;
import org.apache.catalina.User;

import java.util.List;

public interface MovieDao {

    Long insert(Movie movie);

    Movie findOne(Long id);

    Long update(Movie movie);

    List<Movie> findMovies(Movie movie);

}
