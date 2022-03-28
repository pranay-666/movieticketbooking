package com.buffalo.moviebooking.controllers;

import com.buffalo.moviebooking.model.data.Employee;
import com.buffalo.moviebooking.model.data.SeatReservations;
import com.buffalo.moviebooking.repository.SeatReservationRepo;
import com.buffalo.moviebooking.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;
    private final SeatReservationRepo seatReservationRepo;

    @GetMapping(value = "/all/employee")
    public List<Employee> getAllEmployeesData() {
        return bookingService.getAllEmployeesData();
    }

    @GetMapping(value = "/all/seat/")
    public SeatReservations getSeatService() {
        return seatReservationRepo.findById("12419").get();
    }

}
