package com.domain.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductFileRepositoryImpl implements ProductFileRepository {

	public int deleteProduct(int productId) {
		// code here
		int noOfRowsDeleted = 0;
		return noOfRowsDeleted;
	}
	
	@Override
	public synchronized List getListFromFile() {
		// code here
		ArrayList productsList = new ArrayList();
		File productFile = new File("productsList.dat");
		try {
			FileInputStream fileInputStream = new FileInputStream(productFile);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			productsList = (ArrayList)object;
			return productsList;
		}
		catch (IOException | ClassNotFoundException exception) {
			System.out.println(exception);
			return productsList;
		}
	}
	
	@Override
	public Product getProduct() {
		Product product = null;
		File productFile = new File("product.dat");
		try {
			FileInputStream fileInputStream = new FileInputStream(productFile);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			//downcasting casting a base type to a derived type
			product = (Product)object;
			return product;
		}
		catch (IOException | ClassNotFoundException exception) {
			System.out.println(exception);
			return product;
		}
//		Unreachable code
//		return product;
	}

	@Override
	public ArrayList getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public synchronized int  insertListToFile(List products) {
		// code here
				int objectSaved = 0;
				File productFile = new File("productsList.dat");
				try {
					FileOutputStream fileOutputStream =  new FileOutputStream(productFile);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					Object object = products;
					objectOutputStream.writeObject(object);
//					objectOutputStream.writeObject(products);
					objectSaved = products.size();
					System.out.println("Saved : " + objectSaved);
					return objectSaved;
				}
				catch (IOException exception) {
					System.out.println(exception);
					objectSaved = 0;
					return objectSaved;
				}
	}

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
}
