package com.domain.model;

import java.io.Serializable;

// public class Product {
public class Product extends Object implements Serializable{
//	not accssible outside the class
//  instance variable
	private int productId;
	private String productName;
	private float price;

//	constructor 
//	public Product(int productId, String productName,  float price)
//	{
//		this.productId = productId;
//		this.productName = productName;
//		this.price = price;
//	}
// accessor or getter
	public int getProductId() {
		return productId;
	}
	
	public Product() {
		// to be used later....
	}
	
	public Product(int productId, String productName, float price) {
	this.productId = productId;
	this.productName = productName;
	this.price = price;
}

	// mutator setter
	public void setProductId(int productId) {
//			 this.prodictId is the instance variable
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String productString;
		productString = "\nProduct Id : " + getProductId();
		productString += "\tProduct Name : " + getProductName();
		productString += "\tProduct Price : " + getPrice() + "\n";
		return productString;
	}
}
