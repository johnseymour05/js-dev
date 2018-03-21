package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Post;

public interface PostService {

	ResponseEntity<List<Post>> getAllPosts();

}
