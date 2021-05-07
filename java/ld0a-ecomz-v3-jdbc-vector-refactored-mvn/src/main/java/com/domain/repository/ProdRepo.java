package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public interface ProdRepo {

	public abstract Product getProduct();
	public abstract int insertListToFile(List products);
	public abstract List getListFromFile();
	public abstract ArrayList getProducts();
	public int insertProduct(Product product);
	public int insertProductPreparedStatement(Product product);
}
