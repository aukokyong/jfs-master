package com.domain.repository;

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

	public String getProductNameFromRepository() {
		return productName;
	}

	public Product getProductObject() {

//		Product meaningProduct = null;
//		Product meaningProduct = new Product();
		Product meaningProduct = new Product(1,"Man's search for Meaning",50.5f);
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
}
