package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.domain.model.Product;

/*<bean id="productRepository" class="com.domain.repository.ProductRepositoryImpl" />*/
@Component("productRepository")
public class ProductRepositoryImpl implements  ProductRepository{
    public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product ("P01", "Man's Search For Meaning", 300));
        products.add(new Product ("P02", "Awaken the Giant Within", 500));
        return products;
    }
}