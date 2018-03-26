package com.seymour.jsocialbackend.services.dev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository cr;
	
	@Override
	public ResponseEntity<List<Comment>> getAllComments() {
		return new ResponseEntity<>(cr.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Comment> createComment(Comment comment) {
		return new ResponseEntity<>(cr.save(comment), HttpStatus.OK);

	}

}
