package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Cart;
import com.example.entity.Product;
import com.example.repository.CartRepository;

@Service
@Transactional
public class CartService {
	

	long i=0;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductService productService;
	
	// view cart
		public void viewCart() {
			Cart cart=new Cart();
			Optional<Cart> getCart = cartRepository.findById(cart.getId());
			if(getCart.isPresent())
			{
				
					Cart cart1=getCart.get();
					System.out.println("List of products in the cart :");
					for(Product product : cart1.getProducts())
					{
						System.out.println("Product Id : "+product.getId()+" ; Product Name : "+product.getName()
						+" ; Product Price : "+product.getPrice());
					}
	
			}
			}

	// logic to add product to cart
	public void addToCart(Long productId) {
		Cart cart=new Cart();
		if(i==0)
		{
		cart.setId(1+productId);
		i++;
		}
		Optional<Cart> getCart = cartRepository.findById(cart.getId());
		if(getCart.isPresent())
		{
			Optional<Product> getProduct = productService.getProductById(productId);
			getProduct.ifPresent(product->
			{
				Cart cart1=getCart.get();
				cart1.getProducts().add(product);
				cartRepository.save(cart1);
			});
		}
		}
		
		// logic to remove product from cart
	public void removeFromCart(Long cartId,Long productId) {
		Optional<Cart> getCart = cartRepository.findById(cartId);
		if(getCart.isPresent())
		{
			Optional<Product> getProduct = productService.getProductById(productId);
			getProduct.ifPresent(product->
			{
				Cart cart1=getCart.get();
				cart1.getProducts().remove(product);
				cartRepository.save(cart1);
			});
		}
		}

	@SuppressWarnings("deprecation")
	public Cart getCartById(Long cartId) {
		// TODO Auto-generated method stub
		return cartRepository.getById(cartId);
	}

}
