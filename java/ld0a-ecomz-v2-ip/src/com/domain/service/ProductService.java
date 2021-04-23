package com.domain.service;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductService {
	ProductRepository productRepository = null;
	LoggerService loggerService = null;
	public ProductService() {
		System.out.println("ProductService instantiated ....");
		productRepository = new ProductRepository();
		loggerService = new LoggerService();
	}
	
	public String getProductNameFromService() {
		return productRepository.getProductNameFromRepository();
	}
	
	public Product getProductObject() {
		return productRepository.getProductObject();
	}
	
	public void log() {
		loggerService.logForService();
//		loggerService.logForRepository();
	}
}
