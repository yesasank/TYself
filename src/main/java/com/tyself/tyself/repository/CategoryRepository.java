package com.tyself.tyself.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyself.tyself.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}