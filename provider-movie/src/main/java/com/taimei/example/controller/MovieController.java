package com.taimei.example.controller;

import com.taimei.example.entry.Movie;
import com.taimei.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie/{id}")
    public Movie findMovieById(@PathVariable Long id) {
        System.out.println("远程调用请求******");
        return movieService.findById(id);
    }

    @PostMapping("/movie/{id}")
    public Long reduceMovieCount(@PathVariable Long id) {
        return movieService.reduceCount(id);
    }

    @PostMapping("/movie")
    public Long addMovie(Movie movie) {
        System.out.println("插入操作测试******");
        return movieService.addMovie(movie);
    }
}
