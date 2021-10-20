package com.tcs.authservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.authservice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
