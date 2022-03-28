package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reservation")
public class Reservations {
    @Column(name = "reservation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer reservationId;

//    @JsonBackReference
//    @OneToOne(  fetch = FetchType.LAZY , targetEntity = SeatReservations.class)
//    @Fetch(FetchMode.SELECT)
//    @JoinColumn(name = "reservation_id")
//    private SeatReservations seatReservation;

    @Column(name = "screening_id")
    private String screeningId;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "screening_id" , nullable = false , insertable = false , updatable = false)
    private Screening screening;

    @Column(name = "employee_reserved_id")
    private Integer employeeId;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name="employee_reserved_id", nullable=false , insertable = false , updatable = false)
    private Employee employee;


    @Column(name = "reserved")
    private Boolean reserved;

    @Column(name = "paid")
    private Boolean paid;
}
