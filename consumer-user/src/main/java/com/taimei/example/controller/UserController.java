package com.taimei.example.controller;

import com.taimei.example.entry.Movie;
import com.taimei.example.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserFeignClient feignClient;

    @GetMapping("/movie/{id}")
    public Movie findMovieById(@PathVariable Long id) {

        System.out.println("请求接收到了");
        return feignClient.getMovie(id);
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(Movie movie) {

        System.out.println("请求接收到了****");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", "0");
        return feignClient.getMovies(map);
    }

    @PostMapping("/movie/{id}")
    public Long refundTicket(@PathVariable Long id) {

        System.out.println("退票请求接收******");
        return feignClient.reduceTicket(id);
    }

    @PostMapping("/movie1")
    public String refundTicket(Movie movie) {
        System.out.println(movie.toString());
        return feignClient.postMovie(movie);
    }
}
