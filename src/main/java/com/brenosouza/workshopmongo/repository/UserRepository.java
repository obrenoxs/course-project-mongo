package com.brenosouza.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brenosouza.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
