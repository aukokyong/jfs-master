package com.domain.model;

public class Product {
	private Long productId;
	private String productName;
	private String description;
	private float price;

	public Product() {
	}

	public Product(Long productId, String productName, String description, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public Product(String productName, String description, float price) {
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" + "productId=" + productId + ", productName='" + productName + '\'' + ", description='"
				+ description + '\'' + ", price=" + price + '}';
	}
}