package com.domain;

//public class Product extends Object{
public class Product {
	private String name;
	private boolean onDeal;

	public Product(String name, boolean onDeal) {
//	super();
		this.name = name;
		this.onDeal = onDeal;
	}

	public String getName() {
		return name;
	}

	public boolean isOnDeal() {
		return onDeal;
	}

	/*
	 * @Override public String toString() { return "Product [name=" + name +
	 * ", onDeal=" + onDeal + "]"; }
	 */
}
