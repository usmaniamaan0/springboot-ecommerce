package com.mmi.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmi.ecommerce.entity.User;
import com.mmi.ecommerce.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	
	@GetMapping
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}

}
