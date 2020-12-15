package com.microsg2.microsg2client.repository;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpServerErrorException;

import com.microsg2.microsg2client.model.YCategory;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Repository
public class CategoryProxy extends GenericProxy {
	public YCategory getCategory(int id) {
		String getCategoryUrl = props.getApiUrl() + "/category/" + id;
		ResponseEntity<YCategory> response = restTemplate.exchange(
				getCategoryUrl, 
				HttpMethod.GET, 
				null, 
				YCategory.class);
		
		return response.getBody();		
	}
	
	public YCategory createCategory(YCategory category) {
		String createCategoriesUrl = props.getApiUrl() + "/categories";
		HttpEntity<YCategory> requestEntity = new HttpEntity<YCategory>(category);
		ResponseEntity<YCategory> response = restTemplate.exchange(
				createCategoriesUrl, 
				HttpMethod.POST, 
				requestEntity, 
				YCategory.class);
		return response.getBody();
	}
	
	public void deleteCategory(Integer id) {
		String deleteCategoriesUrl = props.getApiUrl() + "/category/" + id;
		ResponseEntity<Void> response = restTemplate.exchange(
				deleteCategoriesUrl, 
				HttpMethod.DELETE,
				null,
				Void.class);
		System.out.println(response.getStatusCode().toString());		
	}
	
	public YCategory updateCategory(YCategory category) {
		String updateCategoriesUrl = props.getApiUrl() + "/category/" + category.getId();
		HttpEntity<YCategory> requestEntity = new HttpEntity<YCategory>(category);
		ResponseEntity<YCategory> response = restTemplate.exchange(
				updateCategoriesUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				YCategory.class);
		return response.getBody();
	}


	@CircuitBreaker(name ="proxy", fallbackMethod = "fallback")
	public Iterable<YCategory> getCategories() {
		String getCategoriesUrl = props.getApiUrl() + "/category";
		ResponseEntity<Iterable<YCategory>> response = restTemplate.exchange(
				getCategoriesUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<YCategory>>() {});
		return response.getBody();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YCategory> fallback(IllegalStateException ex) {
		System.out.println("From fallback method IllegalState : " + ex.getMessage());
		return new ArrayList<YCategory>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YCategory> fallback(TimeoutException ex) {
		System.out.println("From fallback method Timeout : " + ex.getMessage());
		return new ArrayList<YCategory>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<YCategory> fallback(HttpServerErrorException ex) {
		System.out.println("From fallback method HttpServerErrorException : " + ex.getMessage());
		return new ArrayList<YCategory>();
	}
}
