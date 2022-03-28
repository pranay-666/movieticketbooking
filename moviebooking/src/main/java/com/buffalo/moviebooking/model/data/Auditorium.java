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
@Table(name = "auditorium")
public class Auditorium {
    @Id
    @Column(name = "auditorium_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer auditoriumId;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "auditorium_id")
    private Set<Screening> data = new HashSet<>();

    @Column(name = "seat_no")
    private Integer totalSeats;


}
