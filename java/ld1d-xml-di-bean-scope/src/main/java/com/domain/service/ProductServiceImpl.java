package com.domain.service;
import java.util.List;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

import lombok.Getter;
import lombok.Setter;

public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	   @Getter @Setter
	   private String location;
	   @Getter @Setter
	   private String domainName;


	@Override
	   public List<Product> findAll() {
	      return this.productRepository.findAll();
	   }

	public void setDomainName(String domainName) {
		System.out.println("setDomainName(String domainName) ");
		this.domainName = domainName;
	}



//   The ProductRepository dependency is injected by the IOC container into the constructor.
//   public ProductServiceImpl(ProductRepository repository) {
//	   	  System.out.println("CONSTRUCTOR BASED DI ProductServiceImpl(ProductRepository repository)");
//	      this.repository = repository;
//	   }

   public void setLocation(String location) {
	System.out.println("setLocation(String location)");
	this.location = location;
}

public void setProductRepository(ProductRepository productRepository) {
	System.out.println("setProductRepository(ProductRepository productRepository");
	this.productRepository = productRepository;
}
}
