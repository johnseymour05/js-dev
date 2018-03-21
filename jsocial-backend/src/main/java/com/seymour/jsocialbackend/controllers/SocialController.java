package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.services.CommentService;
import com.seymour.jsocialbackend.services.PostService;
import com.seymour.jsocialbackend.services.UserService;

@RestController
@RequestMapping("/social")
public class SocialController {
	
	@Autowired
	UserService us;
	@Autowired
	PostService ps;
	@Autowired
	CommentService cs;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return us.getAllUsers();
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPosts() {
		return ps.getAllPosts();
	}
	
	@GetMapping("/comments")
	public ResponseEntity<List<Comment>> getAllComments() {
		return cs.getAllComments();
	}
	
	
	
	
	@GetMapping("/test")
	public String hello() {
		System.err.println("hello");
		return "hello";
	}
}
