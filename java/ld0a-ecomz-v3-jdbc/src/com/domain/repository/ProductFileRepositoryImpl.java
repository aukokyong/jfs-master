package com.domain.repository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.domain.model.Product;

public class ProductFileRepositoryImpl implements ProductFileRepository {

	public int insertProduct(Product product) {
		// code here
		int objectSaved = 0;
		File productFile = new File("product.dat");
		try {
			FileOutputStream fileOutputStream =  new FileOutputStream(productFile);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(product);
			objectSaved = 1;
			System.out.println("Saved : " + objectSaved);
			return objectSaved;
		}
		catch (IOException exception) {
			System.out.println(exception);
			objectSaved = 0;
			return objectSaved;
		}
	}

	public int udpateProduct(Product product) {
		// code here
		int noOfRowsUpdated = 0;
		return noOfRowsUpdated;
	}

	public int deleteProduct(int productId) {
		// code here
		int noOfRowsDeleted = 0;
		return noOfRowsDeleted;
	}

	@Override
	public ArrayList getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
