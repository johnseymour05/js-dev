package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository ur;

	@Override
	public ResponseEntity<List<User>> getAllUsers()  {
		System.err.println("in user service");
		return new ResponseEntity<>(ur.findAll(), HttpStatus.OK);
	}
}
