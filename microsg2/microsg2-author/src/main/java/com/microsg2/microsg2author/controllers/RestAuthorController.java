package com.microsg2.microsg2author.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microsg2.microsg2author.models.Author;
import com.microsg2.microsg2author.repositories.AuthorRepository;

@RestController
public class RestAuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	
	@GetMapping("/authors/username/{username}")
	public Optional<Author> getAuthorByUsername(@PathVariable("username") String username) throws InterruptedException {
		Optional<Author> author = authorRepository.findAuthorWithName(username);
		return author;		
	}
	
	@GetMapping("/authors")
	public Iterable<Author> getAuthors() {		
		Iterable<Author> authors = authorRepository.findAll();	
		return authors;		
	}
	
	@GetMapping("/author/{id}")
	public Optional<Author> getAuthor(@PathVariable("id") int id) 
			throws InterruptedException {
		Optional<Author> author = authorRepository.findById(id);		
		return author;		
	}
	
	@PostMapping("/author")
	public Author createAuthor(@RequestBody Author author) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedpassword = passwordEncoder.encode(author.getPassword());
		author.setPassword(encodedpassword);
		author = authorRepository.save(author);		
		return author;
	}
	
	@DeleteMapping("/author/{id}")
	public void deleteAuthor(@PathVariable("id") int id) {
		authorRepository.deleteById(id);
	}
}