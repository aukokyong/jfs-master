package com.domain;

import java.util.ArrayList;
import java.util.List;

public class DealCart extends Cart {
	private List<Product> productsList = new ArrayList<Product>();

	public DealCart(String id) {
		super(id);
	}

	public boolean addProduct(Product product) {

		if (product.isOnDeal()) {
			return productsList.add(product);
		}
		return false;
	}
}
