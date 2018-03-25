package com.seymour.jsocialbackend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.entities.Credentials;
import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.UserFollowerId;
import com.seymour.jsocialbackend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository ur;

	@Override
	public ResponseEntity<List<User>> getAllUsers()  {
		return new ResponseEntity<>(ur.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<User> createUser(User user) {
		return new ResponseEntity<>(ur.save(user), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<User> login(Credentials cred) {
		
		String username = cred.getUsername();
		String password = cred.getPassword();
		User user = ur.findByUsernameAndPassword(username, password);
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<User>> getFollowedUsers(User user) {
		List<User> allUsers = new ArrayList<>();

		for(UserFollowerId uf : user.getUserFollowerId()) {
			User u = ur.findById(uf.getFollowedUserId());
			allUsers.add(u);
		}		
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<User> followUser(UserFollowerId userIdToFollow) {
		User user = ur.findById(userIdToFollow.getUserId());
		user.getUserFollowerId().add(userIdToFollow);
		ur.save(user);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
