package com.example.doramaclub.repository;

import com.example.doramaclub.entity.ERole;
import com.example.doramaclub.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Object> findByName(ERole eRole);
}
