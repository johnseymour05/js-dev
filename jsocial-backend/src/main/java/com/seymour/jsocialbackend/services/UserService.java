package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.User;

public interface UserService {

	ResponseEntity<List<User>> getAllUsers();

	ResponseEntity<User> createUser(User user);

}
