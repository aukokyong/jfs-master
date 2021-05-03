package com.domain.service;
import static com.domain.util.Colors.pc;

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
pc("setDomainName(String domainName) ");
		this.domainName = domainName;
	}



//   The ProductRepository dependency is injected by the IOC container into the constructor.
//   public ProductServiceImpl(ProductRepository repository) {
//	   	  System.out.println("CONSTRUCTOR BASED DI ProductServiceImpl(ProductRepository repository)");
//	      this.repository = repository;
//	   }

   public void setLocation(String location) {
pc("setLocation(String location)");
	this.location = location;
}

public void setProductRepository(ProductRepository productRepository) {
	pc("setProductRepository(ProductRepository productRepository");
	this.productRepository = productRepository;
}
}
