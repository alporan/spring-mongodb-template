package com.orana.springmongodbtemplate.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orana.springmongodbtemplate.model.entity.Product;
import com.orana.springmongodbtemplate.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(value = "")
	public List<Product> getAllProducts() {
		return productService.findAll();
	}

	@PostMapping(value = "")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveOrUpdateProduct(product);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteForm(@PathVariable("id") String id) {
		productService.deleteById(id);
	}
}
