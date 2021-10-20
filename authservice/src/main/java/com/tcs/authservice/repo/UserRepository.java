package com.tcs.authservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.authservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	 User findByUsername(String username);
}
