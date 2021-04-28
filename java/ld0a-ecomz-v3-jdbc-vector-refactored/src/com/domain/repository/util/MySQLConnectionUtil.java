package com.domain.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionUtil {
//	public static void main(String[] args) {
////	for testing purposes
//		getConnection();
//	}

//	public static void () {
////		ClassNotFoundException checked exception should be handled
//		try {
//Connection connection = getConnection1();
//			// statement for executing a query
//			Statement statement = connection.createStatement();
//			// get the results
//			ResultSet resultSet =  statement.executeQuery("SELECT * FROM PRODUCTS");
//			while(resultSet.next()) {
//				System.out.print(resultSet.getInt(1) + "\t");
//				System.out.print(resultSet.getString(2)+ "\t");
//				System.out.println(resultSet.getFloat("price"));
//				
//			}
//		} catch (ClassNotFoundException | SQLException exception) {
//			System.out.println(exception);
//		}
//	}

	public static Connection getConnection() {
		try {
			// Load the driver
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			// getting connected
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomz", "root", "mysql");
			System.out.println("Connected!!!");
			return connection;
		} catch (ClassNotFoundException | SQLException exception) {
			System.out.println(exception);
			return null;
		}
	}
}
