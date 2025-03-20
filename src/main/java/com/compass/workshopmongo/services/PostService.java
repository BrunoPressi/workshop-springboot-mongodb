package com.compass.workshopmongo.services;

import java.util.Date;
import java.util.List;
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
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto Não encontrado"));
	}
	
	public List<Post> findByTitle(String title) {
		List<Post> posts = repository.findByTitle(title);
		return posts;
	}
	
	public List<Post> fullSearch(String text, Date min, Date max) {
		max = new Date(max.getTime() + 24 *60 *60 * 1000);
		return repository.fullSearch(text, min, max);
	}
	
}
