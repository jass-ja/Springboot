package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

import com.example.entity.Order;

@Component
public interface OrderRepository extends JpaRepository<Order, Long> 
{
	
}