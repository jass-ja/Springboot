package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

private String description;

private Double price;

private Integer stock;

/**
 * @param id
 * @param name
 * @param description
 * @param price
 * @param stock
 */
public Product(Long id, String name, String description, Double price, Integer stock) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.stock = stock;
}

public Product() {
	// TODO Auto-generated constructor stub
}

/**
 * @return the id
 */
public Long getId() {
	return id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @return the price
 */
public Double getPrice() {
	return price;
}

/**
 * @return the stock
 */
public Integer getStock() {
	return stock;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}

/**
 * @param stock the stock to set
 */
public void setStock(Integer stock) {
	this.stock = stock;
}

}
