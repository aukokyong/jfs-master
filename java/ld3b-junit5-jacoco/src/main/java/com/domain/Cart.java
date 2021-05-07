package com.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
	private String id;
	private String cartType;
	private List<Product> productsList = new ArrayList<Product>();

	public Cart(String id, String cartType) {
		super();
		this.id = id;
		this.cartType = cartType;
	}

	public String getId() {
		return id;
	}

	public String getCartType() {
		return cartType;
	}

	public List<Product> getProductsList() {
		return Collections.unmodifiableList(productsList);
	}

	public boolean addProduct(Product product) {
		switch (cartType) {
		case "General":
			return productsList.add(product);
		case "Deal":
			if (product.isOnDeal()) {
				return productsList.add(product);
			}
			return false;
		default:
			throw new RuntimeException("Unknown cart type : " + cartType);
		}
	}
}
