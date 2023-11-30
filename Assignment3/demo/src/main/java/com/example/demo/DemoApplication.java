package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.CLI.CliApp;
import com.example.entity.Cart;
import com.example.entity.Order;
import com.example.entity.Product;
import com.example.repository.CartRepository;
import com.example.repository.CartRepositoryImpl;
import com.example.repository.OrderRepository;
import com.example.repository.OrderRepositoryImpl;
import com.example.repository.ProductRepository;
import com.example.repository.ProductRepositoryImpl;
import com.example.service.CartService;
import com.example.service.OrderService;
import com.example.service.ProductService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//Bean creation for CliApp class
			@Bean
			public CliApp cliApp()
			{
				return new CliApp();
			}
	
	//Bean creation for Cart class
		@Bean
		public Cart cart()
		{
			return new Cart();
		}
		
		//Bean creation for Order class
		@Bean
		public Order order()
		{
			return new Order();
		}
		
		//Bean creation for Product class
		@Bean
		public Product product()
		{
			return new Product();
		}
	
		//Bean creation for cartService class
				@Bean
				public CartService cartService()
				{
					return new CartService();
				}
				
				//Bean creation for OrderService class
				@Bean
				public OrderService orderService()
				{
					return new OrderService();
				}
				
				//Bean creation for ProductService class
				@Bean
				public ProductService productService()
				{
					return new ProductService();
				}
				
				//Bean creation for cartRepository class
				@Bean
				public CartRepository cartRepository()
				{
					return new CartRepositoryImpl();
				}
				
				//Bean creation for OrderRepository class
				@Bean
				public OrderRepository orderRepository()
				{
					return new OrderRepositoryImpl();
				}
				
				//Bean creation for ProductRepository class
				@Bean
				public ProductRepository productRepository()
				{
					return new ProductRepositoryImpl();
				}
				
				//Bean creation for CartRepositoryImpl class
				@Bean
				public CartRepositoryImpl cartRepositoryImpl()
				{
					return new CartRepositoryImpl();
				}
				
				//Bean creation for OrderRepositoryImplOrderRepositoryImpl class
				@Bean
				public OrderRepositoryImpl orderRepositoryImpl()
				{
					return new OrderRepositoryImpl();
				}
				
				//Bean creation for ProductRepositoryImpl class
				@Bean
				public ProductRepositoryImpl productRepositoryImpl()
				{
					return new ProductRepositoryImpl();
				}
		
			

}
