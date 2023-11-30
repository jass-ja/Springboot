package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Cart;
import com.example.entity.Order;
import com.example.entity.Product;
import com.example.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CartService cartService;

	// logic to place an order
	public void placeOrder() {
		Cart cart=new Cart();
		Cart cart1= cartService.getCartById(cart.getId());
		if(cart1!=null)
		{
			Order order=new Order();
			order.setProducts(cart1.getProducts());
			orderRepository.save(order);
		}
	}

	// logic to view order history
	public void showHistory() 
	{
		List<Order> orderList = orderRepository.findAll();
		for(Order order : orderList)
		{
		System.out.println("Order Id : "+order.getId()+" ; Order Date "+order.getOrderDate()+ " ; Order products : ");
		for(Product product : order.getProducts())
		{
				System.out.println(product.getName());
		}
		}
	}

}
