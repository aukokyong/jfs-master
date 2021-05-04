package com.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.repository.ProductRepository;
import com.domain.repository.ProductRepositoryImpl;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

/*<context:component-scan base-package="com.domain"/>*/
@Configuration
//@ComponentScan("com.domain")
public class AppConfig {
	@Bean
public ProductRepository productRepository() {
	return new ProductRepositoryImpl();
}
	@Bean
	public ProductService productService() {
//		Perform DI
		return new ProductServiceImpl(productRepository());
	}
}
