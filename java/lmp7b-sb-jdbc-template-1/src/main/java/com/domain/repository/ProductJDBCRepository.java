package com.domain.repository;

import java.util.List;
import java.util.Optional;

import com.domain.model.Product;

public interface ProductJDBCRepository {

	List<Product> findAll();

	Optional<Product> findById(long prodcutId);

	int insert(Product product);

	int update(Product product);

	int deleteById(long productId);

	int deleteAll();

}