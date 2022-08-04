package com.sparta.hanghae_assignment_week04.repository;

import com.sparta.hanghae_assignment_week04.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository  extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    boolean existsByUsername( String username );

}
