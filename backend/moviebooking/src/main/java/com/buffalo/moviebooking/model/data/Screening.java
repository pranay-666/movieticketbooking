package com.buffalo.moviebooking.model.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "screening")
public class Screening {

    @Id
    @Column(name = "screening_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer screeningId;

    @Column(name = "movie_id")
    private Integer movie_id;

    @Column(name = "auditorium_id")
    private Integer auditoriumId;

    @Column(name = "screening_start")
    private String startTime;





}
