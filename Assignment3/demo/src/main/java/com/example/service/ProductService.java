package com.example.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.ProductRepository;
import com.example.entity.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> listAllProducts() {
	System.out.println(productRepository.findAll());
	return productRepository.findAll();

	}
	
	public Product getProductById(Long productId)
	{
		return productRepository.findById(productId).orElseThrow();
	}
	
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}

	public void deleteProduct(Long productId)
	{
		productRepository.deleteById(productId);
	}
}
