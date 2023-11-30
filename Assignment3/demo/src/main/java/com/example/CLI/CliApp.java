package com.example.CLI;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Product;
import com.example.service.CartService;
import com.example.service.OrderService;
import com.example.service.ProductService;

@Component
public class CliApp implements CommandLineRunner {
	
	@Autowired
	private ProductService productService;

	@Autowired
	private CartService cartService;

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String...args) throws Exception {

	Scanner scanner = new Scanner(System.in);
	int choice;
	System.out.println("Inside Run");

	do{

	System.out.println("Choose an option:");

	System.out.println("1. List all products");

	System.out.println("2. Add a product to the cart");
	
	System.out.println("3. View cart");

	System.out.println("4. Place an Order");
	
	System.out.println("5. View Order History");
	
	System.out.println("6. Exit");
	
	// ... Other options ...

	choice = scanner.nextInt();

	switch (choice) {

	case 1:
		System.out.println("Inside case 1");

	List<Product> products = productService.listAllProducts();

		// Display products
	if(products!=null)
	{
		System.out.println("List of all products :");
		for(Product product : products)
		{
			System.out.println("Product Id : "+product.getId()+" ; Product Name : "+product.getName()+" ; Product Price : "+product.getPrice());
		}
	}
	else
	{
		System.out.println("No Products to display.");
	}
		break;

	case 2:

		// Add product
		System.out.println("Enter the product Id that needs to be added to cart : ");
		Long productId = scanner.nextLong();
		System.out.println("Adding product to cart : ");
		cartService.addToCart(productId);
		break;

	case 3:

		// View Cart
		System.out.println("Items in the cart :");
		cartService.viewCart();
		break;

	case 4:

		// Place an Order
		System.out.println("Placing order : ");
		orderService.placeOrder();
		break;
	
	case 5:

		// View Order History
		System.out.println("Showing order History : ");
		orderService.showHistory();
		break;
		
	case 6:

		// Exit
		System.out.println("Exiting...");
		break;
	
	default:
		System.out.println("Please enter a correct choice");
	}

	}
	while(choice!=6);
	}

}
