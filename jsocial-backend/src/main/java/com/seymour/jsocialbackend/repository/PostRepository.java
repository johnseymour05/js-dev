package com.seymour.jsocialbackend.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seymour.jsocialbackend.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	List<Post> findAllByUserId(int userId);

	List<Post> findByUserId(Set<Integer> userIds);

}
