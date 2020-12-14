package com.microsg2.microsg2comment.controllers;

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
public class commentController {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@GetMapping("/comment")
	public Iterable<Comment> getComments() {		
		Iterable<Comment> comments = commentRepository.findAll();	
		System.out.println("trace getComments");
		return comments;		
	}
	
	@GetMapping("/comment/{id}")
	public Optional<Comment> getComment(@PathVariable("id") int id) 
			throws InterruptedException {
		Optional<Comment> comment = commentRepository.findById(id);		
		System.out.println("Retrieve " + comment.get().getArticle_id());
		return comment;		
	}
	
	@PostMapping("/comment")
	public Comment createComment(@RequestBody Comment comment) {
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
