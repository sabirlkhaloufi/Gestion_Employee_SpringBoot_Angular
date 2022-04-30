package com.example.demo.repository;

import com.example.demo.model.Cases;
import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CasesRepository extends JpaRepository<Cases,Long> {
    @Override
    List<Cases> findAll();
}
