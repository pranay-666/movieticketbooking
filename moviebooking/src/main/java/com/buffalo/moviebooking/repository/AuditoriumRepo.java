package com.buffalo.moviebooking.repository;

import com.buffalo.moviebooking.model.data.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepo extends JpaRepository<Auditorium, Integer> {
}
