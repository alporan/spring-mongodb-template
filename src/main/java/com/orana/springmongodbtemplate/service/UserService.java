package com.orana.springmongodbtemplate.service;

import java.util.List;

import com.orana.springmongodbtemplate.model.entity.User;

public interface UserService {

	List<User> findAllByOrderByRegistryNoDesc();

	User findByRegistryNo(Long regisrtyNo);
	
	User findByEmail(String email);
	
	User save(User user);
	
	void deleteById(String id);
}
