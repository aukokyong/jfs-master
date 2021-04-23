package com.domain.repository;

import java.util.ArrayList;

import com.domain.exception.ProductNotAvailableException;
import com.domain.model.Product;

public class ProductRepository {

// functionality related to repository handling
// Encapsulating the productName
	private String productName;

	// constructors are methods with same class name
	// purpose : initialize
//  constructor without parameter is a default constructor
	// called automatically with new keyword
	public ProductRepository() {
		System.out.println("ProductRepository instantiated ....");
		productName = "Fullstack Development";
	}

	public String log() {
		// business functionality
		return "cnv message";
	}

	public String getProductNameFromRepository() {
		return productName;
	}

	public Product getProductObject() {

//		Product meaningProduct = null;
//		Product meaningProduct = new Product();
		Product meaningProduct = new Product(1, "Man's search for Meaning", 50.5f);
		try {

//			meaningProduct.setProductId(1);
//			meaningProduct.setProductName("Man's search for Meaning");
//			meaningProduct.setPrice(50.50f);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Secret Log : " + nullPointerException);
			System.out.println("Hi <<Person>>, please try after some time!");
		}

//		return meaningProduct;
		// consider the product is not available
		// instantiate the user defined exception
		try {
			if (meaningProduct == null) {
				ProductNotAvailableException productNotAvailableException = new ProductNotAvailableException();
				throw productNotAvailableException;
			}
		}

		catch (ProductNotAvailableException productNotAvailableException) {
			System.out.println("Sorry, the product you are looking for is not avaibable..");
		}
		return null;
	}

	public ArrayList getProducts() {
		ArrayList products = new ArrayList();
		Product product = new Product(1, "The Values Factor", 50.0f);
		products.add(product);
		products.add(new Product(2, "Elon Musk", 50.0f));
		products.add(new Product(3, "The Power of Now", 50.0f));
		return products;
	}
}
