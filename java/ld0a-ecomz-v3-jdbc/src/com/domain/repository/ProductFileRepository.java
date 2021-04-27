package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public interface ProductFileRepository {
	public abstract ArrayList getProducts();
	public int insertProduct(Product product);
	public abstract Product getProduct();
	public abstract int insertArrayListToFile(List products);
}
