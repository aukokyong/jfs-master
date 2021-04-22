package com.domain.ui;

import com.domain.service.ProductService;

public class CRUDApp {
	public static void main(String[] args) {
		System.out.println("Build a CRUD.....");
		// creating the product service reference
		ProductService productService = null;
		//instantiate the product service
		productService = new ProductService();
		//Read
		String productName = productService.getProductNameFromService();
		System.out.println(productName);
	}
}
