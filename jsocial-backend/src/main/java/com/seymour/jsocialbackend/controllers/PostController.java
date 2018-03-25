package com.seymour.jsocialbackend.controllers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private static final Logger logger = Logger.getLogger(PostController.class);

	@Autowired
	PostService ps;
	
	@GetMapping("/all")
	public ResponseEntity<List<Post>> getAllPosts() {
		logger.debug("Post Controller: getAllPosts");
		return ps.getAllPosts();
	}
	
	@GetMapping("/postId/{postId}")
	public ResponseEntity<Post> getPostById(@PathVariable int postId) {
		logger.debug("Post Controller: getPostById");
		return ps.getPostById(postId);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		logger.debug("Post Controller: createPost");
		return ps.createPost(post);
	}
	@GetMapping("/userId/{userId}")
	public ResponseEntity<List<Post>> getPostsByUserId(@PathVariable int userId) {
		logger.debug("Post Controller: getPostsByUserId");
		return ps.getPostsByUserId(userId);
	}
		
	@PostMapping("/following")
	public ResponseEntity<List<Post>> getPostsOfUsersFollowed(@RequestBody Integer[] userId) {
		System.err.println(userId.toString());
		logger.debug("Post Controller: getPostsOfUsersFollowed");
		Set<Integer> mySet = new HashSet<Integer>();
		Collections.addAll(mySet, userId);
		System.err.println(mySet.toString());
		return ps.getPostsOfUsersFollowed(mySet);
	}
	@PostMapping("/addComment")
	public ResponseEntity<Post> addComment(@RequestBody Comment comment) {
		System.err.println(comment.toString());
		logger.debug("Post Controller: addComment");
		return ps.addComment(comment);
	}
}
