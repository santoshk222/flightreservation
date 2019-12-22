package com.sk.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.reservation.entities.User;

public interface PassangerRepository extends JpaRepository<User, Long> {

}
