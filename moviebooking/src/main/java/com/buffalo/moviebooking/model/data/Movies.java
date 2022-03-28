package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "movie")
public class Movies {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    @Fetch(FetchMode.SELECT)
    private Set<Screening> screenings = new HashSet<>();

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "movie_cast")
    private String cast;

    @Column(name = "genre")
    private String genre;



}
