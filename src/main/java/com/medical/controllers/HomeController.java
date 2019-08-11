package com.medical.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.models.User;
import com.medical.repos.UserRepo;

@Controller
public class HomeController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/")
	public String home(Model m){
		m.addAttribute("result",userRepo.findAll());
		return "home";
	}
}
