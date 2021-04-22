package com.domain.repository;

public class ProductRepository {
// functionality related to repository handling
// Encapsulating the productName
 private String productName;
 // constructors are methods with same class name
 // purpose : initialize
//  constructor without parameter is a default constructor
 // called automatically with new keyword
 public ProductRepository(){
	 System.out.println("ProductRepository instantiated ....");
	 productName = "Fullstack Development";
 }
	public String getProductNameFromRepository() {
		return productName;
	}
}
