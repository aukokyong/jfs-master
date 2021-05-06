package com.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.model.Product;
import com.domain.repository.ProductJDBCRepository;


@SpringBootApplication
public class App implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProductJDBCRepository productJDBCRepository;
	
	public static void main(String[] args) {
		System.out.println("MAIN BEGIN ");
		SpringApplication.run(App.class, args);
		System.out.println("MAIN END");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.error("DELETING All PRODUCTSJ -> {}", productJDBCRepository.deleteAll());
		logger.error("Inserting -> {}",
				productJDBCRepository.insert(new Product(1L, "Elon", "autobiography", 50.0f)));
		logger.error("Inserting -> {}",
				productJDBCRepository.insert(new Product(2L, "Meaning", "Hitler's period of terror....", 50.0f)));

		logger.error("All PRODUCTSJ -> {}", productJDBCRepository.findAll());
		logger.error("Update 2L -> {}", productJDBCRepository.update(new Product(2L, "Man's search", "Viktor Frankl's experience", 950.0f)));

		logger.error("All PRODUCTSJ -> {}", productJDBCRepository.findAll());
		productJDBCRepository.deleteById(2L);

		logger.error("All PRODUCTSJ -> {}", productJDBCRepository.findAll());
	}

}
