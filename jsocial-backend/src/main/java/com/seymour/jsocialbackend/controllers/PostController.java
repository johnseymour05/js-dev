package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService ps;
	
	@GetMapping("/all")
	public ResponseEntity<List<Post>> getAllPosts() {
		return ps.getAllPosts();
	}
	
	@GetMapping("/postId/{postId}")
	public ResponseEntity<Post> getPostById(@PathVariable int postId) {
		return ps.getPostById(postId);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		return ps.createPost(post);
	}
	@GetMapping("/userId/{userId}")
	public ResponseEntity<List<Post>> getPostsByUserId(@PathVariable int userId) {
		return ps.getPostsByUserId(userId);
	}
		
	@GetMapping("/following")
	public ResponseEntity<List<Post>> getPostsOfUsersFollowed(@RequestParam int[] userId) {
		return ps.getPostsOfUsersFollowed(userId);
	}
}
