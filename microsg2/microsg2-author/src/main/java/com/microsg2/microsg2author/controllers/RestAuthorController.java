package com.microsg2.microsg2author.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microsg2.microsg2author.model.Author;

@RestController
public class RestAuthorController {
	
	@GetMapping("/author/{id}")
	public Author getAuthor(@PathVariable("id") int id) {
		return getAuthor(id);
	}
	
	@GetMapping("/author")
	public Iterable<Author> getAuthors() {
		return getAuthors();
	}
	
}
