package com.seymour.jsocialbackend.services.dev;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.Follow;

public interface UserFollowerIdService {

	ResponseEntity<List<Follow>> getAllUserFollowerIds();

	ResponseEntity<Follow> createUserFollowerId(Follow userFollowerId);

}
