package com.example.minkia_pitittu.repository;


import com.example.minkia_pitittu.entity.Roles;
import com.example.minkia_pitittu.entity.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByRoleName(RoleType roleName);
    
}
