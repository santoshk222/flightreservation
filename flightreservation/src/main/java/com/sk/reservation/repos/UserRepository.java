package com.sk.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String username);

}
