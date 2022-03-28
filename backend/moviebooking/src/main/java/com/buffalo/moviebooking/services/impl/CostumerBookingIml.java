package com.buffalo.moviebooking.services.impl;

import com.buffalo.moviebooking.model.data.Employee;
import com.buffalo.moviebooking.repository.EmployeeRepository;
import com.buffalo.moviebooking.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CostumerBookingIml implements BookingService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployeesData() {

        return employeeRepository.findAll();
    }
}
