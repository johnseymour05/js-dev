package com.seymour.jsocialbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seymour.jsocialbackend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
