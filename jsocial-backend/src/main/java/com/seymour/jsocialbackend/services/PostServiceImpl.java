package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository pr;

	@Override
	public ResponseEntity<List<Post>> getAllPosts() {
		return new ResponseEntity<>(pr.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Post> createPost(Post post) {
		return new ResponseEntity<>(pr.save(post), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Post> getPostById(int postId) {
		Post post = pr.findById(postId).get();
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Post>> getPostsByUserId(int userId) {
		List<Post> posts = pr.findAllByUserId(userId);
		return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Post>> getPostsOfUsersFollowed(int[] userId) {
		List<Post> posts = pr.findAllByUserIds(userId);
		return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<List<Post>> findAllByUserIds(int[] userId) {
		List<Post> posts = pr.findAllByUserIds(userId);
		return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
	}

	
}
