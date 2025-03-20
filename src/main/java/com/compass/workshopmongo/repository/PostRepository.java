package com.compass.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.compass.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>  {

}
