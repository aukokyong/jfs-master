package com.domain.service;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	ProductRepository productRepository = null;
	LoggerService loggerService = null;
	public ProductServiceImpl() {
		System.out.println("ProductService instantiated ....");
		productRepository = new ProductRepository();
		loggerService = new LoggerService();
	}
	
//	only for testing
	public String getProductNameFromService() {
		return productRepository.getProductNameFromRepository();
	}

	@Override
	public Product getProductObject() {
		return productRepository.getProductObject();
	}
	
	

//	public void log() {
//		loggerService.logForService();
////		loggerService.logForRepository();
//	}
}
