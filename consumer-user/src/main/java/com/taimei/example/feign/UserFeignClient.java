package com.taimei.example.feign;

import com.taimei.example.entry.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "provider-movie")
public interface UserFeignClient {

    @GetMapping("/movie/{id}")
    Movie getMovie(@PathVariable("id") Long id);

    @PostMapping("/movie/{id}")
    Long reduceTicket(@PathVariable("id") Long id);

    /**
     * GET请求接受多个参数
     * @param map
     * @return
     */
    @GetMapping(value = "/movies")
    List<Movie> getMovies(@RequestParam Map<String,Object> map);

    /**
     * POST请求接受多个参数
     * @param movie
     * @return
     */
    @PostMapping(value = "/movie")
    String postMovie(@RequestBody Movie movie);
}
