package com.orana.springmongodbtemplate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orana.springmongodbtemplate.model.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findAll();
	
	Optional<Product> findById(String id);

	Product save(Product product);

	void deleteById(String id);
}
