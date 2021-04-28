package com.domain.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.domain.model.Product;
import com.domain.repository.ProductFileRepository;
import com.domain.repository.ProductFileRepositoryImpl;
import com.domain.repository.ProductFileVectorRepositoryImpl;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class CRUDApp {


	private static void getProductFromFile() {
		ProductFileRepository productFileRepository = new ProductFileRepositoryImpl();
		Product product = productFileRepository.getProduct();
		System.out.println(product);
	}

	private static void getArrayListFromFile() {
		ProductFileRepository productFileRepository = new ProductFileRepositoryImpl();
		List productsList = productFileRepository.getListFromFile();
		System.out.println(productsList);
	}
	private static void getVectorFromFile() {
		ProductFileRepository productFileRepository = new ProductFileVectorRepositoryImpl();
		List productsList = productFileRepository.getListFromFile();
		System.out.println(productsList);
	}
	private static void getProductObject() {
		// creating the product service reference
		ProductService productService = null;
		// instantiate the product service
		productService = new ProductServiceImpl();
		// Read
//		String productName = productService.getProductNameFromService();
//		System.out.println(productName);

		Product product = productService.getProductObject();
//		productService.getProductNameFromService();
//		System.out.println("Product Id : " + product.getProductId());
//		System.out.println("Product Name : " + product.getProductName());
//		System.out.println("Product Price : " + product.getPrice());
		if (product != null)
			System.out.println(product);
	}

	private static void getProducts() {
		// creating the product service reference
		ProductService productService = null;
		// instantiate the product service
		productService = new ProductServiceImpl();
		ArrayList products = productService.getProducts();
//		productService.getProductNameFromService();
//		System.out.println("Product Id : " + product.getProductId());
//		System.out.println("Product Name : " + product.getProductName());
//		System.out.println("Product Price : " + product.getPrice());
		System.out.println(products);
	}

	private static void getProductsFromDB() {
		// creating the product service reference
		ProductService productService = null;
		// instantiate the product service
		productService = new ProductServiceImpl();
	}

	private static void insertArrayListToFile() {
//		ArrayList products = new ArrayList();
		List products = new ArrayList();
//		ArrayList arrayList = new List();
		Product product = new Product(1, "The Values Factor", 50.0f);
		products.add(product);
		products.add(new Product(2, "Elon Musk", 50.0f));
		products.add(new Product(3, "The Power of Now", 50.0f));

		ProductFileRepository productFileRepository = new ProductFileRepositoryImpl();
		int saved = productFileRepository.insertListToFile(products);
		System.out.println("Saved : " + saved);
	}
	private static void insertVectorToFile() {
//		ArrayList products = new ArrayList();
		List products = new Vector();
//		ArrayList arrayList = new List();
		Product product = new Product(1, "The Values Factor", 50.0f);
		products.add(product);
		products.add(new Product(2, "Elon Musk", 50.0f));
		products.add(new Product(3, "The Power of Now", 50.0f));

		ProductFileRepository productFileRepository = new ProductFileVectorRepositoryImpl();
		int saved = productFileRepository.insertListToFile(products);
		System.out.println("Saved : " + saved);
	}
	private static void insertProduct() {
		// creating the product service reference
		ProductService productService = null;
		productService = new ProductServiceImpl();
		// IP create a new product and insert
		int inserted = productService.insertProduct(null);
		System.out.println("Inserted : " + inserted);
	}

	private static void insertProductToFile() {
	
		ProductFileRepository productFileRepository = new ProductFileRepositoryImpl();
		int saved = productFileRepository.insertProduct(new Product(1, "Rich Dad Poor Dad", 56));
		System.out.println("Saved : " + saved);
	}

	public static void main(String[] args) {
		System.out.println("Build a CRUD.....");
//		getProductObject();
//		getProducts();
//		insertProduct();
//		getProducts();
//		insertProductToFile();
//		getProductFromFile();
//		insertArrayListToFile();
//		getArrayListFromFile();
//		insertArrayListToFile();
//		getArrayListFromFile();
		insertVectorToFile();
		getVectorFromFile();
	}

}
