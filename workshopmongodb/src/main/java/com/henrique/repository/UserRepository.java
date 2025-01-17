package com.henrique.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.henrique.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
