package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProdDBRepo implements ProdRepo{

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertListToFile(List products) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List getListFromFile() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ArrayList getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertProductPreparedStatement(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
