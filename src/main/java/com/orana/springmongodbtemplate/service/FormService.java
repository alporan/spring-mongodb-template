package com.orana.springmongodbtemplate.service;

import java.util.List;
import java.util.Optional;

import com.orana.springmongodbtemplate.model.entity.Form;

public interface FormService {
	
	List<Form> findAllByOrderByFormNoDesc();
	
	Optional<Form> findById(String id);
	
	Form saveOrUpdateForm(Form form);
	
	void deleteFormById(String id);
}
