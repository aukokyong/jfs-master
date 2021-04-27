package com.domain.repository;

import java.util.ArrayList;

import com.domain.model.Product;

public interface ProductFileRepository {
	public abstract ArrayList getProducts();
	public int insertProduct(Product product);
}
