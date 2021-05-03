package com.domain.service;
import java.util.List;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

   private ProductRepository repository;

//   The ProductRepository dependency is injected by the IOC container into the constructor.
   public ProductServiceImpl(ProductRepository repository) {
	   	  System.out.println("CONSTRUCTOR BASED DI ProductServiceImpl(ProductRepository repository)");
	      this.repository = repository;
	   }

   @Override
   public List<Product> findAll() {
      return this.repository.findAll();
   }
}
