package com.socialmedia.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.socialmedia.entity.ERole;
import com.socialmedia.entity.Role;





public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
