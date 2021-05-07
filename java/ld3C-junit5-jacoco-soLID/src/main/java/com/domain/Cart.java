package com.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// SoLID (open-closed) principle
// REPLACING CONDITIONAL WITH POLYMORPHISM
// TDD BENEFITS
// IMPROVE CODE DESIGN BY REFACTORING
public abstract class Cart {
	private String id;
	List<Product> productsList = new ArrayList<Product>();

	public Cart(String id) {
		super();
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public List<Product> getProductsList() {
		return Collections.unmodifiableList(productsList);
	}

	public abstract boolean addProduct(Product product);
}
