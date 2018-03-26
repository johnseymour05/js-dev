package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.Credentials;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.Follow;
import com.seymour.jsocialbackend.services.UserService;
import com.seymour.jsocialbackend.services.dev.UserFollowerIdService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		return us.getAllUsers();
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return us.createUser(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody Credentials cred) {
		return us.login(cred);
	}
	
	@GetMapping("/usersfollowed/{userId}")
	public ResponseEntity<List<User>> getFollowedUsers(@PathVariable int userId) {
		return us.getFollowedUsers(userId);
	}
	
	@PostMapping("/followUser")
	public ResponseEntity<User> followUser(@RequestBody Follow follow) {
		return us.followUser(follow);
	}
	@PostMapping("/unfollowUser")
	public ResponseEntity<User> unfollowUser(@RequestBody Follow follow) {
		return us.unfollowUser(follow);
	}
	
}
