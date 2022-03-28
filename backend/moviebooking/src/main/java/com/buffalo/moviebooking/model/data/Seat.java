package com.buffalo.moviebooking.model.data;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private String seatId;

    @Column(name = "seat_row")
    private Integer row;

    @Column(name = "seat_number")
    private Integer number;

    @Column(name = "auditorium_id")
    private Integer auditoriumId;

}
