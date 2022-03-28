package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "screening")
public class Screening {

    @Id
    @Column(name = "screening_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer screeningId;

    @JsonBackReference
    @OneToOne(mappedBy = "screening",fetch = FetchType.LAZY)
    private Reservations reservations;



    @Column(name = "movie_id")
    private Integer movie_id;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "movie_id" , nullable = false , updatable = false , insertable = false)
    private Movies movies;

    @Column(name = "auditorium_id")
    private Integer auditoriumId;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "auditorium_id" , nullable = false , updatable = false , insertable = false)
    private Auditorium auditorium;

    @Column(name = "screening_start")
    private String startTime;





}
