package com.domain.ui;

import java.util.ArrayList;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class CRUDApp {
	private static void getProductObject() {
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

	private static void getProducts() {
			// creating the product service reference
			ProductService productService = null;
			//instantiate the product service
			productService = new ProductServiceImpl();			
			ArrayList products  = productService.getProducts();
	//		productService.getProductNameFromService();
	//		System.out.println("Product Id : " + product.getProductId());
	//		System.out.println("Product Name : " + product.getProductName());
	//		System.out.println("Product Price : " + product.getPrice());
			System.out.println(products);
		}

	public static void main(String[] args) {
		System.out.println("Build a CRUD.....");
//		getProductObject();
		getProducts();
	}
}
