package com.mmi.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmi.ecommerce.entity.Product;
import com.mmi.ecommerce.repository.ProductRepository;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		return productRepository.save(product);
	}
	
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}

}
