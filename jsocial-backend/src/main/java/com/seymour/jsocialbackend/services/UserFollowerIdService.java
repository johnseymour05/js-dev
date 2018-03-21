package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.UserFollowerId;

public interface UserFollowerIdService {

	ResponseEntity<List<UserFollowerId>> getAllUserFollowerIds();

	ResponseEntity<UserFollowerId> createUserFollowerId(UserFollowerId userFollowerId);

}
