package com.buffalo.moviebooking.repository;

import com.buffalo.moviebooking.model.data.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {

}
