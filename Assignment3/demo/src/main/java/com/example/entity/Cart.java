package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToMany
private List<Product> products;

/**
 * @param id
 * @param products
 */
public Cart(Long id, List<Product> products) {
	super();
	this.id = id;
	this.products = products;
}

public Cart() {
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

}
