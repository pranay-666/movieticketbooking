package com.buffalo.moviebooking.model.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "seat_reserved")
public class SeatReservations {
    @Id
    @Column(name = "seat_reserved_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer searReservationId;

    @Column(name = "seat_id")
    private Integer seatId;

    @Column(name = "screening_id")
    private Integer screeningId;

    @Column(name = "reservation_id")
    private Integer reservationId;

}
