package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Comment;
import com.seymour.jsocialbackend.entities.Credentials;
import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.UserFollowerId;

public interface UserService {

	ResponseEntity<List<User>> getAllUsers();

	ResponseEntity<User> createUser(User user);

	ResponseEntity<User> login(Credentials cred);

	ResponseEntity<List<User>> getFollowedUsers(User user);

	ResponseEntity<User> followUser(UserFollowerId userIdToFollow);

}
