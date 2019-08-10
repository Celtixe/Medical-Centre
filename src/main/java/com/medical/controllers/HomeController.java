package com.medical.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.models.User;
import com.medical.repos.UserRepo;

@RestController
public class HomeController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/")
	public List<User> home(){
		return userRepo.findAll();
	}
}
