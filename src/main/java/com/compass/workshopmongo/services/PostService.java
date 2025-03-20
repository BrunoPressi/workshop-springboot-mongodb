package com.compass.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compass.workshopmongo.domain.Post;
import com.compass.workshopmongo.repository.PostRepository;
import com.compass.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> post =  repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto Não encontrado"));
	}
	
	
}
