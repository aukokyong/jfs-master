package com.domain;

public class GeneralCart extends Cart{

	public GeneralCart(String id) {
		super(id);
	}

	public boolean addProduct(Product product) {
			return productsList.add(product);
	}
}
