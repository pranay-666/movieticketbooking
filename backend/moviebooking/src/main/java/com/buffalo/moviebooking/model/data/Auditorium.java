package com.buffalo.moviebooking.model.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auditorium")
public class Auditorium {
    @Id
    @Column(name = "auditorium_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer auditoriumId;

    @Column(name = "seat_no")
    private Integer totalSeats;


}
