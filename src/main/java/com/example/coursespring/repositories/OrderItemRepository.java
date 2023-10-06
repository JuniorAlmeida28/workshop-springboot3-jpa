package com.example.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursespring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

    
}
