package com.taimei.example.service.movieServiceImpl;

import com.taimei.example.dao.MovieDao;
import com.taimei.example.entry.Movie;
import com.taimei.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public Long reduceCount(Long id) {
        Movie movie = movieDao.findOne(id);
        Movie param = new Movie();
        param.setId(id);
        param.setTicketCount(movie.getTicketCount()-1);
        return movieDao.update(param);
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.findOne(id);
    }

    @Override
    public Long addMovie(Movie movie) {
        return movieDao.insert(movie);
    }
}
