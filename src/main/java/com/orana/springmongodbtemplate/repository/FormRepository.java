package com.orana.springmongodbtemplate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orana.springmongodbtemplate.model.entity.Form;

public interface FormRepository extends MongoRepository<Form, String> {

	List<Form> findAllByOrderByFormNoDesc();
	
	Optional<Form> findById(String id);
	
	Form save(Form form);
	
	void deleteById(String id);
}