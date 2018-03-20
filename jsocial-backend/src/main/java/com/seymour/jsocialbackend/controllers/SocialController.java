package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.services.UserService;

@RestController
@RequestMapping("/social")
public class SocialController {
	
	@Autowired
	UserService us;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return us.getAllUsers();
	}
	@GetMapping("/hello")
	public String hello() {
		System.err.println("hello");
		return "hello";
	}
	
}
