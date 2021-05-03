package com.domain.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

@Component("productService")
public class ProductServiceImpl implements ProductService {
// Field based DI
//   @Autowired
   private ProductRepository repository;

//   The ProductRepository dependency is injected by the IOC container into the constructor.
	/*
	 * @Autowired public ProductServiceImpl(ProductRepository repository) {
	 * System.out.
	 * println("CONSTRUCTOR BASED DI ProductServiceImpl(ProductRepository repository)"
	 * ); this.repository = repository; }
	 */
// Setter based DI
   @Autowired
   public void setRepository(ProductRepository repository) {
	      System.out.println("setRepository(ProductRepository repository)");
	      this.repository = repository;
	   }
   @Override
   public List<Product> findAll() {
      return this.repository.findAll();
   }
}
