package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Column(name = "username")
    private String username;
    @Column(name = "user_password")
    private String password;

    @JsonManagedReference
    @OneToMany( fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "employee_reserved_id" , referencedColumnName = "employee_id")
    List<Reservations> reservations = new ArrayList<>();

}
