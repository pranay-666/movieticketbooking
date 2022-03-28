package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reservation")
public class Reservations {
    @Column(name = "reservation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer reservationId;

    @Column(name = "screening_id")
    private Integer screeningId;



    @Column(name = "employee_reserved_id")
    private Integer employeeId;

    @JsonBackReference
    @ManyToOne()
  //  @Fetch(FetchMode.SELECT)
    @JoinColumn(name="employee_reserved_id", nullable=false , insertable = false , updatable = false)
    private Employee employee;


    @Column(name = "reserved")
    private Boolean reserved;

    @Column(name = "paid")
    private Boolean paid;
}
