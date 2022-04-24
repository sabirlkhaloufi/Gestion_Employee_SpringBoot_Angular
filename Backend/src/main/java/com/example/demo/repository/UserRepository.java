package com.example.demo.repository;

import com.example.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long> {
    AppUser findAppUserByUsername(String username);
    AppUser findAppUserById(Long id);
    Long deleteAppUserById(Long id);
}
