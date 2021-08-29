package com.orana.springmongodbtemplate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.orana.springmongodbtemplate.model.entity.Form;
import com.orana.springmongodbtemplate.repository.FormRepository;
import com.orana.springmongodbtemplate.service.FormService;

@Service
public class FormServiceImpl implements FormService {

	private FormRepository formRepository;

	public FormServiceImpl(FormRepository formRepository) {
		this.formRepository = formRepository;
	}

	@Override
	public List<Form> findAllByOrderByFormNoDesc() {
		return formRepository.findAllByOrderByFormNoDesc();
	}
	
	@Override
	public Optional<Form> findById(String id) {
		return formRepository.findById(id);
	}

	@Override
	public Form saveOrUpdateForm(Form form) {
		return formRepository.save(form);
	}

	@Override
	public void deleteFormById(String id) {
		formRepository.deleteById(id);
	}
}
