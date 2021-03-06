package com.buffalo.moviebooking.repository;

import com.buffalo.moviebooking.model.data.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
