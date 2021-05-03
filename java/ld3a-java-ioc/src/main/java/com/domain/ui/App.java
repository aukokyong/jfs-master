package com.domain.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.config.AppConfig;
import com.domain.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		System.out.println("SPRING XML CONFIG IOC");
//		ProductRepository productRepository = new ProductRepositoryImpl();
//		System.out.println(productRepository.findAll());
		
//		Load the IOC container and it will configure the Spring Beans
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ProductRepository productRepository = (ProductRepository) context.getBean("productRepository");
		ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
		productRepository.findAll().forEach(System.out::println);
		ProductRepository oracleProductRepository = context.getBean("oracleProductRepository", ProductRepository.class);
		oracleProductRepository.findAll().forEach(System.out::println);
		context.close();
	}
}
