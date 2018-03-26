package com.seymour.jsocialbackend.services.dev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.seymour.jsocialbackend.entities.User;
import com.seymour.jsocialbackend.entities.Follow;
import com.seymour.jsocialbackend.repository.UserFollowerIdRepository;

@Service
public class UserFollowerIdServiceImpl implements UserFollowerIdService {

	@Autowired
	UserFollowerIdRepository ufr;
	
	@Override
	public ResponseEntity<List<Follow>> getAllUserFollowerIds() {
		return new ResponseEntity<>(ufr.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Follow> createUserFollowerId(Follow userFollowerId) {
		return new ResponseEntity<>(ufr.save(userFollowerId), HttpStatus.OK);
	}

}
