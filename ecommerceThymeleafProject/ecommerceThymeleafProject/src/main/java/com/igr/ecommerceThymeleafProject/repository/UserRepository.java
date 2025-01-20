package com.igr.ecommerceThymeleafProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igr.ecommerceThymeleafProject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}
