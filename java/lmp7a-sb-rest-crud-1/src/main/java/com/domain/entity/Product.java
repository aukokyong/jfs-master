package com.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productName;
	private String description;
	private float price;

	public Product() {
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