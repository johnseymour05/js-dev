package com.seymour.jsocialbackend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.controllers.PostController;
import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	private static final Logger logger = Logger.getLogger(PostController.class);

	@Autowired
	PostRepository pr;

	@Override
	public ResponseEntity<List<Post>> getAllPosts() {
		logger.debug("PostServiceImpl: getAllPosts");
		return new ResponseEntity<>(pr.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Post> createPost(Post post) {
		logger.debug("PostServiceImpl: createPost");
		return new ResponseEntity<>(pr.save(post), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Post> getPostById(int postId) {
		logger.debug("PostServiceImpl: getPostById");
		Post post = pr.findById(postId).get();
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Post>> getPostsByUserId(int userId) {
		logger.debug("PostServiceImpl: getPostsByUserId");
		List<Post> posts = pr.findAllByUserId(userId);
		return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Post>> getPostsOfUsersFollowed(Set<Integer> userIds) {
		logger.debug("PostServiceImpl: getPostsOfUsersFollowed");
		List<Post> allPosts = new ArrayList<>();
		for (int i : userIds) {
			List<Post> posts = pr.findAllByUserId(i);
			allPosts.addAll(posts);
		}
		return new ResponseEntity<List<Post>>(allPosts, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<List<Post>> findAllByUserIds(int[] userId) {
		logger.debug("PostServiceImpl: findAllByUserIds");
		return null;
	}

	@Override
	public ResponseEntity<Post> addComment(Comment comment) {
		int postId = comment.getPostId();
		Post post = pr.findById(postId).get();
		post.getComments().add(comment);
		pr.save(post);
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}

	
}
