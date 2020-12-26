package com.microsg2.microsg2client.repository;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.microsg2.microsg2client.model.YAuthor;

@Repository
public class AuthorProxy extends GenericProxy {
	
	public YAuthor getAuthor(int id) {
		String getAuthorUrl = props.getApiUrl() + "/author/" + id;
		ResponseEntity<YAuthor> response = restTemplate.exchange(
				getAuthorUrl, 
				HttpMethod.GET, 
				null, 
				YAuthor.class);
		return response.getBody();		
	}
	
	public YAuthor createAuthor(YAuthor author) {
		String createAuthorsUrl = props.getApiUrl() + "/author";
		HttpEntity<YAuthor> requestEntity = new HttpEntity<YAuthor>(author);
		ResponseEntity<YAuthor> response = restTemplate.exchange(
				createAuthorsUrl, 
				HttpMethod.POST, 
				requestEntity, 
				YAuthor.class);
		return response.getBody();
	}
	
	public void deleteAuthor(Integer id) {
		String deleteAuthorsUrl = props.getApiUrl() + "/author/" + id;
		ResponseEntity<Void> response = restTemplate.exchange(
				deleteAuthorsUrl, 
				HttpMethod.DELETE,
				null,
				Void.class);
		System.out.println(response.getStatusCode().toString());		
	}
	
	public YAuthor updateAuthor(YAuthor author) {
		String updateAuthorsUrl = props.getApiUrl() + "/author/" + author.getId();
		HttpEntity<YAuthor> requestEntity = new HttpEntity<YAuthor>(author);
		ResponseEntity<YAuthor> response = restTemplate.exchange(
				updateAuthorsUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				YAuthor.class);
		return response.getBody();
	}
	
	
	public Iterable<YAuthor> getAuthors() {
		String getAuthorsUrl = props.getApiUrl() + "/author";
		ResponseEntity<Iterable<YAuthor>> response = restTemplate.exchange(
				getAuthorsUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<YAuthor>>() {});
		return response.getBody();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YAuthor> fallback(IllegalStateException ex) {
		System.out.println("From fallback method IllegalState : " + ex.getMessage());
		return new ArrayList<YAuthor>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YAuthor> fallback(TimeoutException ex) {
		System.out.println("From fallback method Timeout : " + ex.getMessage());
		return new ArrayList<YAuthor>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YAuthor> fallback(HttpServerErrorException ex) {
		System.out.println("From fallback method HttpServerErrorException : " + ex.getMessage());
		return new ArrayList<YAuthor>();
	}	
}
