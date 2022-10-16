package com.husseinabdallah.authenticationApp.repositories;

import com.husseinabdallah.authenticationApp.models.ERole;
import com.husseinabdallah.authenticationApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
