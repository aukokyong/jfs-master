package com.domain.ui;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class CRUDApp {
	public static void main(String[] args) {
		System.out.println("Build a CRUD.....");
		// creating the product service reference
		ProductService productService = null;
		//instantiate the product service
		productService = new ProductServiceImpl();
		//Read
//		String productName = productService.getProductNameFromService();
//		System.out.println(productName);
		
		Product product  = productService.getProductObject();
//		productService.getProductNameFromService();
//		System.out.println("Product Id : " + product.getProductId());
//		System.out.println("Product Name : " + product.getProductName());
//		System.out.println("Product Price : " + product.getPrice());
		if(product != null)
		System.out.println(product);
	}
}
