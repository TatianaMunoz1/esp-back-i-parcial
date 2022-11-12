package com.dh.movie.repository;


import com.dh.movie.model.Movie2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie2, Long> {


    List<Movie2> findByGenre(String genre);
}
