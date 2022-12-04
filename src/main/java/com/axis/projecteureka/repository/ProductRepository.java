package com.axis.projecteureka.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.projecteureka.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}