package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private String seatId;

    @JsonBackReference
    @OneToOne( mappedBy = "seat", fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private SeatReservations seatReservation;


    @Column(name = "seat_row")
    private Integer row;

    @Column(name = "seat_number")
    private Integer number;

    @Column(name = "auditorium_id")
    private Integer auditoriumId;

}
