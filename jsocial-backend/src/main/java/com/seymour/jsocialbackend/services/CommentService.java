package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.User;

public interface CommentService {

	public ResponseEntity<List<Comment>> getAllComments();

	public ResponseEntity<Comment> createComment(Comment comment);

	
}
