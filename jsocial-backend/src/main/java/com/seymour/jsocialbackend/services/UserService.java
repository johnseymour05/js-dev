package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.User;

public interface UserService {

	ResponseEntity<List<User>> getAllUsers();

}
