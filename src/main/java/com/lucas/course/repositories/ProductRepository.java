package com.lucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
