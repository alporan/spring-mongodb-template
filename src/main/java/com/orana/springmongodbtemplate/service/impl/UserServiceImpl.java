package com.orana.springmongodbtemplate.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.orana.springmongodbtemplate.model.entity.User;
import com.orana.springmongodbtemplate.repository.UserRepository;
import com.orana.springmongodbtemplate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAllByOrderByRegistryNoDesc() {
		return userRepository.findAllByOrderByRegistryNoDesc();
	}

	@Override
	public User findByRegistryNo(Long regisrtyNo) {
		return userRepository.findByRegistryNo(regisrtyNo);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User save(User User) {
		return userRepository.save(User);
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}
}
