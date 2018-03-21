package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Comment;

public interface CommentService {

	public ResponseEntity<List<Comment>> getAllComments();

	
}
