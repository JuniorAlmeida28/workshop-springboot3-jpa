package com.example.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    
}
