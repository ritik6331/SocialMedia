package com.socialmedia.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.socialmedia.entity.User;



public interface UserRepository extends MongoRepository<User, String> {
	User findByEmail(String email);
	List<User> findByIsActive(boolean isActive);
	Boolean existsByEmail(String email);
}
