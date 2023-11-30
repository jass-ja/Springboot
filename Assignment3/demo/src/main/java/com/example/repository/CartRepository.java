package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

import com.example.entity.Cart;

@Component
public interface CartRepository extends JpaRepository<Cart, Long> 
{
	
}