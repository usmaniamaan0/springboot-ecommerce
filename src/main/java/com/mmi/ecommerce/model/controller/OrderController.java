package com.mmi.ecommerce.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mmi.ecommerce.entity.Product;
import com.mmi.ecommerce.entity.User;
import com.mmi.ecommerce.model.entity.Order;
import com.mmi.ecommerce.model.repository.OrderRepository;
import com.mmi.ecommerce.repository.ProductRepository;
import com.mmi.ecommerce.repository.UserRepository;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/place")
	public Order placeOrder(@RequestParam  Long userId,
			                @RequestParam Long productId,
			                @RequestParam  int quantity)
	{
		User user = userRepository.findById(userId).orElse(null);
		Product product = productRepository.findById(productId).orElse(null);
		
		if(user == null || product == null)
		{
			throw new RuntimeException("user or product not found");
		}
		
		Order order = new Order(user, product, quantity);
		return orderRepository.save(order);
	}

}
