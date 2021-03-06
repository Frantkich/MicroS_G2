package com.microsg2.microsg2comment.controllers;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microsg2.microsg2comment.models.Comment;
import com.microsg2.microsg2comment.repositories.CommentRepository;

@RestController
public class CommentController {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@GetMapping("/comment")
	public Iterable<Comment> getComments() {		
		Iterable<Comment> comments = commentRepository.findAll();	
		return comments;		
	}

	@GetMapping("/comment/{id}")
	public Optional<Comment> getComment(@PathVariable("id") int id) 
			throws InterruptedException {
		Optional<Comment> comments = commentRepository.findById(id);
		return comments;		
	}

	@GetMapping("/comment/article/{id}")
	public Optional<Iterable<Comment>> getArticle(@PathVariable("id") int id) 
			throws InterruptedException {
		Optional<Iterable<Comment>> comments = commentRepository.getArticle(id);
		return comments;		
	}
	
	@PostMapping("/comment")
	public Comment createComment(@RequestBody Comment comment) {
		Date date = new Date();
		comment.setDate(date);
		comment = commentRepository.save(comment);		
		return comment;
	}
	
	@DeleteMapping("/comment/{id}")
	public void deleteComment(@PathVariable("id") int id) {
		commentRepository.deleteById(id);
	}
	
	@PutMapping("/comment/{id}")
	public Comment updateComment(@PathVariable("id") int id, @RequestBody Comment comment) {
		Comment currentComment = commentRepository.findById(id).get();	
		
		String content = comment.getContent();
		if(content != null) {
			currentComment.setContent(content);
		}		
		
		currentComment = commentRepository.save(currentComment);
		return currentComment;
	}	
	
	
}
