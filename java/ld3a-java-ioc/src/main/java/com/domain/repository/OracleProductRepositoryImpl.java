package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.domain.model.Product;
@Component("oracleProductRepository")
public class OracleProductRepositoryImpl implements  ProductRepository{
    public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product ("P03", "Can't hurt me", 300));
        products.add(new Product ("P04", "The Monk who sold his Ferrari", 500));
        return products;
    }
}