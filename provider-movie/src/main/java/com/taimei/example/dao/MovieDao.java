package com.taimei.example.dao;

import com.taimei.example.entry.Movie;
import org.apache.catalina.User;

public interface MovieDao {

    Long insert(Movie movie);

    Movie findOne(Long id);

    Long update(Movie movie);

}
