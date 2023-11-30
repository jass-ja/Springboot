package com.example.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Order")
public class Order {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToMany
private List<Product> products;

private LocalDateTime orderDate;

/**
 * @param id
 * @param products
 * @param orderDate
 */
public Order(Long id, List<Product> products, LocalDateTime orderDate) {
	super();
	this.id = id;
	this.products = products;
	this.orderDate = orderDate;
}

public Order() {
	// TODO Auto-generated constructor stub
}

/**
 * @return the id
 */
public Long getId() {
	return id;
}

/**
 * @return the products
 */
public List<Product> getProducts() {
	return products;
}

/**
 * @return the orderDate
 */
public LocalDateTime getOrderDate() {
	return orderDate;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}

/**
 * @param products the products to set
 */
public void setProducts(List<Product> products) {
	this.products = products;
}

/**
 * @param orderDate the orderDate to set
 */
public void setOrderDate(LocalDateTime orderDate) {
	this.orderDate = orderDate;
}

}