package com.domain.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entity.Product;
import com.domain.repository.ProductRepository;
import com.domain.utility.Colors;

@RestController
//http://localhost:8080/ecz/api
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	//@RequestMapping(value = "/products", method = RequestMethod.GET)
	//@GetMapping(value = "/products")
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		List<Product> productsList =  productRepository.findAll();
		productsList.forEach(Colors::pc);
		return productsList;
	}
	// @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable(value="id") Long productId) {
		Optional<Product> optinalProduct = productRepository.findById(productId);
		Product product = optinalProduct.get();
		Colors.pc(product);
		return product;
	}
	//@RequestMapping(value = "/products", method = RequestMethod.POST)
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
	      Colors.pc("Inserting " + product);
	      Product productReturned = productRepository.save(product);
	      Colors.pc("Inserted " + product);
		return productReturned;
	}
	   //@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(value="id") Long productId, @RequestBody Product product) {
		Optional<Product> optinalProduct = productRepository.findById(productId);
		Product productFromDB = optinalProduct.get();
		productFromDB.setProductName(product.getProductName());
		productFromDB.setDescription(product.getDescription());
		productFromDB.setPrice(product.getPrice());
	      Colors.pc("Updating " + product);
	      Product productReturned = productRepository.save(productFromDB);
	      Colors.pc("Updated " + product);
		return productReturned;
	}

	   // @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	   @DeleteMapping("/products/{id}")
	   public boolean deleteProduct(@PathVariable(value = "id") Long productId) {
	      productRepository.deleteById(productId);
	      Colors.pc("Deleted " + productId);
	      return true;
	   }
	
}