package com.domain.repository;

import java.util.ArrayList;

import com.domain.model.Product;

public interface ProductRepository {
	public abstract ArrayList getProducts();
	public int insertProduct(Product product);
}
