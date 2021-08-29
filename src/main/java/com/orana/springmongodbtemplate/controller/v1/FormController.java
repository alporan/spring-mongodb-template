package com.orana.springmongodbtemplate.controller.v1;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orana.springmongodbtemplate.model.entity.Form;
import com.orana.springmongodbtemplate.service.FormService;

@RestController
@RequestMapping("/api/v1/form")
public class FormController {

	private FormService formService;

	public FormController(FormService formService) {
		this.formService = formService;
	}

	@GetMapping(value = "")
	public List<Form> getAllForms() {
		return formService.findAllByOrderByFormNoDesc();
	}

	@PostMapping(value = "")
	public Form saveForm(@RequestBody Form form) {
		return formService.saveOrUpdateForm(form);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteForm(@PathVariable("id") String id) {
		formService.deleteFormById(id);
	}
}
