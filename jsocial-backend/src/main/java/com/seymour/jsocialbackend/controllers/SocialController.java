package com.seymour.jsocialbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.UserFollowerId;
import com.seymour.jsocialbackend.services.CommentService;
import com.seymour.jsocialbackend.services.PostService;
import com.seymour.jsocialbackend.services.UserFollowerIdService;
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
	@Autowired
	UserFollowerIdService ufs;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		return us.getAllUsers();
	}
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return us.createUser(user);
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getAllPosts() {
		return ps.getAllPosts();
	}
	@PostMapping("/posts")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		return ps.createPost(post);
	}
	
	@GetMapping("/comments")
	public ResponseEntity<List<Comment>> getAllComments() {
		return cs.getAllComments();
	}
	@PostMapping("/comments")
	public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
		return cs.createComment(comment);
	}
	
	@GetMapping("/followed-user-ids")
	public ResponseEntity<List<UserFollowerId>> getAllUserFollowerIds() {
		return ufs.getAllUserFollowerIds();
	}
	@PostMapping("/followed-user-ids")
	public ResponseEntity<UserFollowerId> createUserFollowerId(@RequestBody UserFollowerId userFollowerId) {
		return ufs.createUserFollowerId(userFollowerId);
	}

	
	@GetMapping("/test")
	public String hello() {
		System.err.println("hello");
		return "hello";
	}
	@GetMapping("/test2")
	public String hello2() {
		System.err.println("hello");
		return "hello";
	}
}
