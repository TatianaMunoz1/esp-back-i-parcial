package com.dh.movie.service;


import com.dh.movie.model.Movie2;
import com.dh.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie2> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }


    public Movie2 save(Movie2 movie) {
        return movieRepository.save(movie);
    }
}
