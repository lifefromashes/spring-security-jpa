package com.Kristin.springsecurityjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kristin.springsecurityjpa.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}
