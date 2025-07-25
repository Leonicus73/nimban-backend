package com.example.nimban_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nimban_backend.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
