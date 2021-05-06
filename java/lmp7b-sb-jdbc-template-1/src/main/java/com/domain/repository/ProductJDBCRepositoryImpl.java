package com.domain.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.domain.model.Product;

@Repository
public class ProductJDBCRepositoryImpl implements ProductJDBCRepository   {
	@Autowired
	JdbcTemplate jdbcTemplate;

	class ProductRowMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Product product = new Product();
			product.setProductId(resultSet.getLong(1));
			product.setProductName(resultSet.getString(2));
			product.setDescription(resultSet.getString(3));
			product.setPrice(resultSet.getFloat(4));
			return product;
		}

	}

	@Override
	public List<Product> findAll() {
		ProductRowMapper productRowMapper = new ProductRowMapper();
		List<Product> productsList = jdbcTemplate.query("SELECT * FROM PRODUCTSJ", productRowMapper);
		return productsList;

//		return jdbcTemplate.query("SELECT * FROM PRODUCTSJ", new ProductRowMapper());

//		return jdbcTemplate.query("SELECT * FROM PRODUCTSJ", new RowMapper<Product>()  {
//			@Override
//			public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//				Product product = new Product();
//				product.setProductId(resultSet.getLong(1));
//				product.setProductName(resultSet.getString(2));
//				product.setDescription(resultSet.getString(3));
//				product.setPrice(resultSet.getFloat(4));
//				return product;
//			}
//			
//		});

//		return jdbcTemplate.query("SELECT * FROM PRODUCTSJ", (ResultSet resultSet, int rowNum) -> {
//			Product product = new Product();
//			product.setProductId(resultSet.getLong(1));
//			product.setProductName(resultSet.getString(2));
//			product.setDescription(resultSet.getString(3));
//			product.setPrice(resultSet.getFloat(4));
//			return product;
//		});

//		return jdbcTemplate.query("SELECT * FROM PRODUCTSJ", ( resultSet,  rowNum) -> {
//			Product product = new Product();
//			product.setProductId(resultSet.getLong(1));
//			product.setProductName(resultSet.getString(2));
//			product.setDescription(resultSet.getString(3));
//			product.setPrice(resultSet.getFloat(4));
//			return product;
//		});
	}

	@Override
	public Optional<Product> findById(long prodcutId) {
		BeanPropertyRowMapper<Product> beanPropertyRowMapper = new BeanPropertyRowMapper<Product>(Product.class);
		Product product = jdbcTemplate.queryForObject("SELECT * FROM PRODUCTSJ where product_id = ?",
				beanPropertyRowMapper);
		return Optional.of(product);
	}

	@Override
	public int insert(Product product) {
		return jdbcTemplate.update(
				"insert into PRODUCTSJ (product_id, product_name, description, price) values(?, ?, ?, ?)",
				new Object[] { product.getProductId(), product.getProductName(), product.getDescription(),
						product.getPrice() });
	}

	@Override
	public int update(Product product) {
		return jdbcTemplate.update(
				"update PRODUCTSJ " + " set product_name = ?, description = ?, price = ? " + " where product_id = ?",
				new Object[] { product.getProductName(), product.getDescription(), product.getPrice(),
						product.getProductId() });
	}

	@Override
	public int deleteById(long productId) {
		return jdbcTemplate.update("delete from PRODUCTSJ where product_id=?", new Object[] { productId });
	}

	@Override
	public int deleteAll() {
		return jdbcTemplate.update("delete from PRODUCTSJ");
	}

}
