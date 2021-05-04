package com.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entity.Product;
import com.domain.repository.ProductRepository;
import com.domain.utility.Colors;

@RestController
//http://localhost:8080/ecz/api
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> productsList =  productRepository.findAll();
		productsList.forEach(Colors::pc);
		return productsList;
	}
}