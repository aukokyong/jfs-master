package com.domain.repository;

import java.util.List;

import com.domain.model.Product;

public interface ProductFileRepository {
	public abstract List getProducts();
	public int insertProduct(Product product);
	public abstract Product getProduct();
	public abstract int insertListToFile(List products);
	public abstract List getListFromFile();
}
