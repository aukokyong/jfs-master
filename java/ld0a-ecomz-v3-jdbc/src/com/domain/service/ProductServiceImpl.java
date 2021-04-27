package com.domain.service;

import java.util.ArrayList;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;
import com.domain.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{
	ProductRepository productRepository = null;
	LoggerService loggerService = null;
	public ProductServiceImpl() {
		System.out.println("ProductService instantiated ....");
		productRepository = new ProductRepositoryImpl();
		loggerService = new LoggerService();
	}
	
//	only for testing
	public String getProductNameFromService() {
		return new ProductRepositoryImpl().getProductNameFromRepository();
	}

	@Override
	public Product getProductObject() {
		return new ProductRepositoryImpl().getProductObject();
	}

	@Override
	public ArrayList getProducts() {
return productRepository.getProducts();
	}

	@Override
	public int insertProduct(Product product) {
		int rowsInserted = productRepository.insertProduct(product);
		return rowsInserted;
	}
	
	

//	public void log() {
//		loggerService.logForService();
////		loggerService.logForRepository();
//	}
}
