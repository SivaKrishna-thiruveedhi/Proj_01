package com.library.repo.user;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findByEmail(String email);
}
