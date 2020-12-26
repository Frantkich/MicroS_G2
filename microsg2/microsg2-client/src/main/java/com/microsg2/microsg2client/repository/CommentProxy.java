package com.microsg2.microsg2client.repository;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpServerErrorException;

import com.microsg2.microsg2client.model.YComment;

@Repository
public class CommentProxy extends GenericProxy {
	public YComment getComment(int id) {
		String getCommentUrl = props.getApiUrl() + "/comment/" + id;
		ResponseEntity<YComment> response = restTemplate.exchange(
				getCommentUrl, 
				HttpMethod.GET, 
				null, 
				YComment.class);
		return response.getBody();		
	}

	public YComment createComment(YComment comment) {
		String createCommentsUrl = props.getApiUrl() + "/comments";
		HttpEntity<YComment> requestEntity = new HttpEntity<YComment>(comment);
		ResponseEntity<YComment> response = restTemplate.exchange(
				createCommentsUrl, 
				HttpMethod.POST, 
				requestEntity, 
				YComment.class);
		return response.getBody();
	}
	
	public void deleteComment(Integer id) {
		String deleteCommentsUrl = props.getApiUrl() + "/comment/" + id;
		ResponseEntity<Void> response = restTemplate.exchange(
				deleteCommentsUrl, 
				HttpMethod.DELETE,
				null,
				Void.class);
		System.out.println(response.getStatusCode().toString());		
	}
	
	public YComment updateComment(YComment comment) {
		String updateCommentsUrl = props.getApiUrl() + "/comment/" + comment.getId();
		HttpEntity<YComment> requestEntity = new HttpEntity<YComment>(comment);
		ResponseEntity<YComment> response = restTemplate.exchange(
				updateCommentsUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				YComment.class);
		return response.getBody();
	}
	
	
	public Iterable<YComment> getComments() {
		String getCommentsUrl = props.getApiUrl() + "/comment";
		ResponseEntity<Iterable<YComment>> response = restTemplate.exchange(
				getCommentsUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<YComment>>() {});
		return response.getBody();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YComment> fallback(IllegalStateException ex) {
		System.out.println("From fallback method IllegalState : " + ex.getMessage());
		return new ArrayList<YComment>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YComment> fallback(TimeoutException ex) {
		System.out.println("From fallback method Timeout : " + ex.getMessage());
		return new ArrayList<YComment>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YComment> fallback(HttpServerErrorException ex) {
		System.out.println("From fallback method HttpServerErrorException : " + ex.getMessage());
		return new ArrayList<YComment>();
	}	
}
