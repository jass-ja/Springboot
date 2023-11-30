package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.entity.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Long>{

}
