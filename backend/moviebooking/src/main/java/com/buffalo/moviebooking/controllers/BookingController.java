package com.buffalo.moviebooking.controllers;

import com.buffalo.moviebooking.model.data.Employee;
import com.buffalo.moviebooking.repository.MoviesRepository;
import com.buffalo.moviebooking.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;
    private final MoviesRepository moviesRepository;

    @GetMapping(value = "/all/employee")
    public List<Employee> getAllEmployeesData(){
        return bookingService.getAllEmployeesData();
    }
}
