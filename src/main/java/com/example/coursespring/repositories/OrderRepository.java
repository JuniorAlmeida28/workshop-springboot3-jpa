package com.example.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

    
}
