package com.domain.service;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductService {
	ProductRepository productRepository = null;

	public ProductService() {
		System.out.println("ProductService instantiated ....");
		productRepository = new ProductRepository();
	}
	
	public String getProductNameFromService() {
		return productRepository.getProductNameFromRepository();
	}
	
	public Product getProductObject() {
		return productRepository.getProductObject();
	}
}
