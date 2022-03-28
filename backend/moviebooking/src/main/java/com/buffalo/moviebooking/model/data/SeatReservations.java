package com.buffalo.moviebooking.model.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "seat_reserved")
public class SeatReservations {

    @Id
    @Column(name = "seat_reserved_id")
    @GeneratedValue()
    private String searReservationId;

    @Column(name = "seat_id" , unique = true)
    private String seatId;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seat_id" , nullable = false , updatable = false,insertable = false)
    @Fetch(FetchMode.JOIN)
    private Seat seat;

    @Column(name = "screening_id")
    private Integer screeningId;

    @Column(name = "reservation_id")
    private Integer reservationId;

//    @JsonManagedReference
//    @OneToOne(fetch = FetchType.LAZY , targetEntity = Reservations.class)
//    @JoinColumn(name = "reservation_id" , nullable = false , updatable = false,insertable = false)
//    @Fetch(FetchMode.SELECT)
//    private Reservations reservations;

}
