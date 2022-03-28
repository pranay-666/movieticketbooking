package com.buffalo.moviebooking.repository;

import com.buffalo.moviebooking.model.data.Seat;
import com.buffalo.moviebooking.model.data.SeatReservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatReservationRepo extends JpaRepository<SeatReservations, String> {
}
