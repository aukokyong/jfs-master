package com.domain.ui;

import java.util.ArrayList;

import com.domain.model.Product;
import com.domain.repository.ProductFileRepository;
import com.domain.repository.ProductFileRepositoryImpl;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class CRUDApp {
	public static void main(String[] args) {
		System.out.println("Build a CRUD.....");
//		getProducts();
//		insertProduct();
//		getProducts();
		insertProductToFile();
//		getProductObject();
//		getProducts();
	}
	private static void insertProduct() {
		// creating the product service reference
		ProductService productService = null;
		productService = new ProductServiceImpl();		
		//IP create a new product and insert
		int inserted = productService.insertProduct(null);
		System.out.println("Inserted : " + inserted);
	}
	private static void insertProductToFile() {
		ProductFileRepository productFileRepository = new ProductFileRepositoryImpl();
		int saved = productFileRepository.insertProduct(new Product(1, "Rich Dad Poor Dad", 56));
		System.out.println("Saved : " + saved);
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

	private static void getProductsFromDB() {
		// creating the product service reference
		ProductService productService = null;
		//instantiate the product service
		productService = new ProductServiceImpl();			
	}


}
