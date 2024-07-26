package com.example.minkia_pitittu.repository;

import com.example.minkia_pitittu.entity.Users;
import com.example.minkia_pitittu.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.lang.NonNull;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @NonNull
    Optional<Users> findByUsername(@NonNull String username);

    @NonNull
    Optional<Users> findByNome(@NonNull String nome);

    @NonNull
    Optional<Users> findByEmail(@NonNull String email);

    @NonNull
    Optional<Users> findByPhone(@NonNull String phone);

    @NonNull
    Optional<Users> findByAddress(@NonNull String address);

    @NonNull
    Optional<Users> findByPostalCode(@NonNull String postalCode);

    @NonNull
    Optional<Users> findByRoles(@NonNull Roles roles);

    @Override
    default void delete(@NonNull Users user) {
        deleteById(user.getId());
    }
}