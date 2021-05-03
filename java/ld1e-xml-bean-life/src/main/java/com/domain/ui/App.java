package com.domain.ui;

import static com.domain.util.Colors.pb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.service.ProductService;

public class App {
	public static void main(String[] args) {
//		System.out.println("SPRING XML CONFIG IOC");
		pb("SPRING XML CONFIG IOC");
//		ProductRepository productRepository = new ProductRepositoryImpl();
//		System.out.println(productRepository.findAll());

//		Load the IOC container and it will configure the Spring Beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ProductRepository productRepository = (ProductRepository) context.getBean("productRepository");
//		ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
//		productRepository.findAll().forEach(System.out::println);
//		ProductRepository oracleProductRepository = context.getBean("oracleProductRepository", ProductRepository.class);
//		oracleProductRepository.findAll().forEach(System.out::println);
		ProductService productService = context.getBean("productService", ProductService.class);
		pb(productService);
		productService = context.getBean("productService", ProductService.class);
		pb(productService);
		pb("Shutting down the IOC container");
		context.close();
	}

	public static void main1(String[] args) {
		System.out.println("SPRING XML CONFIG IOC");
//		ProductRepository productRepository = new ProductRepositoryImpl();
//		System.out.println(productRepository.findAll());

//		Load the IOC container and it will configure the Spring Beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ProductRepository productRepository = (ProductRepository) context.getBean("productRepository");
//		ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
//		productRepository.findAll().forEach(System.out::println);
//		ProductRepository oracleProductRepository = context.getBean("oracleProductRepository", ProductRepository.class);
//		oracleProductRepository.findAll().forEach(System.out::println);
		ProductService productService = context.getBean("productService", ProductService.class);
		productService.findAll().forEach(System.out::println);
		System.out.println(productService.getDomainName());
		System.out.println(productService.getLocation());
	}
}
