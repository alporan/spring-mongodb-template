package com.orana.springmongodbtemplate.service;

import java.util.List;
import java.util.Optional;

import com.orana.springmongodbtemplate.model.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Optional<Product> findById(String id);

	Product saveOrUpdateProduct(Product product);

	void deleteById(String id);
}
