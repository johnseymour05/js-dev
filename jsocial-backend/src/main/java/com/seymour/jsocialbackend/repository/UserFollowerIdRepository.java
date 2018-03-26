package com.seymour.jsocialbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seymour.jsocialbackend.entities.Follow;

@Repository
public interface UserFollowerIdRepository extends JpaRepository<Follow, Integer> {

}
