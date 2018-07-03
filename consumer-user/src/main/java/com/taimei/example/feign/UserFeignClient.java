package com.taimei.example.feign;

import com.taimei.example.entry.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "provider-movie")
public interface UserFeignClient {

    @GetMapping("/movie/{id}")
    Movie getMovie(@PathVariable("id") Long id);

    @PostMapping("/movie/{id}")
    Long reduceTicket(@PathVariable("id") Long id);

    @GetMapping("/movies")
    List<Movie> getMovies();
}
