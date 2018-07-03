package com.taimei.example.controller;

import com.taimei.example.entry.Movie;
import com.taimei.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie/{id}")
    public Movie findMovieById(@PathVariable Long id) {
        System.out.println("远程调用请求******");
        return movieService.findById(id);
    }

    @GetMapping("/movies")
    public List<Movie> findMovieById(Movie movie) {
        System.out.println("远程调用请求******");
        return movieService.getMovieList(movie);
    }

    @PostMapping("/movie/{id}")
    public Long reduceMovieCount(@PathVariable Long id) {
        return movieService.reduceCount(id);
    }

    @PostMapping("/movie")
    public Movie postMovie(@RequestBody Movie movie) {
        System.out.println("Post多个参数操作测试******");

        return movie;
    }
}
