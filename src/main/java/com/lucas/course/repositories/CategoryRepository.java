package com.lucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
