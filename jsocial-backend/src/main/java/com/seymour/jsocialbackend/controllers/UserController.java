package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.services.UserFollowerIdService;
import com.seymour.jsocialbackend.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService us;
	
	@Autowired
	UserFollowerIdService ufs;
	
	@GetMapping("/all-users")
	public ResponseEntity<List<User>> getAllUsers() {
		return us.getAllUsers();
	}
	@PostMapping("/create-user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return us.createUser(user);
	}

	@GetMapping("/test")
	@ResponseBody
	public String hello() {
		System.err.println("hello");
		return "hello";
	}
}
