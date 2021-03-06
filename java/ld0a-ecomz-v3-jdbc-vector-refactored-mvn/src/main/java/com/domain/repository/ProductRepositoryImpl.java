package com.domain.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.domain.exception.ProductNotAvailableException;
import com.domain.model.Product;
import com.domain.repository.util.MySQLConnectionUtil;

public class ProductRepositoryImpl implements ProductRepository {

// functionality related to repository handling
// Encapsulating the productName
	private String productName;

	// constructors are methods with same class name
	// purpose : initialize
//  constructor without parameter is a default constructor
	// called automatically with new keyword
	public ProductRepositoryImpl() {
		System.out.println("ProductRepository instantiated ....");
		productName = "Fullstack Development";
	}

	public String log() {
		// business functionality
		return "cnv message";
	}

	public String getProductNameFromRepository() {
		return productName;
	}

	public Product getProductObject() {

//		Product meaningProduct = null;
//		Product meaningProduct = new Product();
		Product meaningProduct = new Product(1, "Man's search for Meaning", 50.5f);
		try {

//			meaningProduct.setProductId(1);
//			meaningProduct.setProductName("Man's search for Meaning");
//			meaningProduct.setPrice(50.50f);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Secret Log : " + nullPointerException);
			System.out.println("Hi <<Person>>, please try after some time!");
		}

//		return meaningProduct;
		// consider the product is not available
		// instantiate the user defined exception
		try {
			if (meaningProduct == null) {
				ProductNotAvailableException productNotAvailableException = new ProductNotAvailableException();
				throw productNotAvailableException;
			}
		}

		catch (ProductNotAvailableException productNotAvailableException) {
			System.out.println("Sorry, the product you are looking for is not avaibable..");
		}
		return null;
	}

	public ArrayList getProductsFromStub() {
		ArrayList products = new ArrayList();
		Product product = new Product(1, "The Values Factor", 50.0f);
		products.add(product);
		products.add(new Product(2, "Elon Musk", 50.0f));
		products.add(new Product(3, "The Power of Now", 50.0f));
		return products;
	}

	public ArrayList getProductsObsolete() {
//		try {
//			Connection connection = MySQLConnectionUtil.getConnection();
//			// statement for executing a query
//			Statement statement = connection.createStatement();
//			// get the results
//			ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");
//			while (resultSet.next()) {
//				System.out.print(resultSet.getInt(1) + "\t");
//				System.out.print(resultSet.getString(2) + "\t");
//				System.out.println(resultSet.getFloat("price"));
//
//			}
//		} catch (SQLException exception) {
//			System.out.println(exception);
//		}

		ArrayList products = new ArrayList();
		// IP : THE VALUES FROM DB
//		Product product = new Product(1, "The Values Factor", 50.0f);
//		products.add(product);
//		products.add(new Product(2, "Elon Musk", 50.0f));
//		products.add(new Product(3, "The Power of Now", 50.0f));
		return products;
	}

	public ArrayList getProducts() {
		ArrayList products = new ArrayList();
		try {
			Connection connection = MySQLConnectionUtil.getConnection();
			// statement for executing a query
			Statement statement = connection.createStatement();
			// get the results
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");
			while (resultSet.next()) {
				Product product = new Product();
				product.setProductId(resultSet.getInt(1));
				product.setProductName(resultSet.getString(2));
				product.setPrice(resultSet.getFloat(3));
//				System.out.println(product);
				products.add(product);
			}
		} catch (SQLException exception) {
			System.out.println(exception);
		}

		// IP : THE VALUES FROM DB
//		Product product = new Product(1, "The Values Factor", 50.0f);
//		products.add(product);
//		products.add(new Product(2, "Elon Musk", 50.0f));
//		products.add(new Product(3, "The Power of Now", 50.0f));
		return products;
	}

//	IP Refactor to reduce boiler-plate code.
	public int insertProduct(Product product) {
		// code here
		int noOfRowsInserted = 0;
		try {
			Connection connection = MySQLConnectionUtil.getConnection();
			// statement for executing a query
			Statement statement = connection.createStatement();
//			Perform insert DML
			noOfRowsInserted = statement.executeUpdate("INSERT INTO PRODUCTS VALUES(5,'START WITH WHY',15)");
			System.out.println("Inserted : " + noOfRowsInserted);
			return noOfRowsInserted;
		}
		catch (SQLException exception) {
			System.out.println(exception);
		}
		return noOfRowsInserted;
	}
//	IP Refactor to reduce boiler-plate code.
	public int insertProductPreparedStatement(Product product) {
		// code here
		int rowInserted = 0;
		try {
			Connection connection = MySQLConnectionUtil.getConnection();
			// prepared statement for executing a query
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUCTS VALUES(?,?,?)");
//			Perform insert DML
			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "12 RULES FOR LIFE");
			preparedStatement.setFloat(3, 50);
			
			rowInserted = preparedStatement.executeUpdate();
			System.out.println("Inserted : " + rowInserted);
			return rowInserted;
		}
		catch (SQLException exception) {
			System.out.println(exception);
		}
		return rowInserted;
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
}
