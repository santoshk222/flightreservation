package com.sk.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
