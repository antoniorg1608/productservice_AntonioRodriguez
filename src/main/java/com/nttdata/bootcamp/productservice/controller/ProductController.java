package com.nttdata.bootcamp.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.service.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
		
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable String id) {
		return productService.get(id);
		
	}
	
	@PostMapping("/product")
	public Product postProduct(@RequestBody String id) {
		return productService.post(id);
	}
}
