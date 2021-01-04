package com.microsg2.microsg2client.repository;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpServerErrorException;

import com.microsg2.microsg2client.model.Article;

@Repository
public class ArticleProxy extends GenericProxy {
	
	public Article getArticle(int id) {
		String getArticleUrl = props.getApiUrl() + "/article/" + id;
		ResponseEntity<Article> response = restTemplate.exchange(
			getArticleUrl, HttpMethod.GET, null, Article.class);
		return response.getBody();
	}

	public Iterable<Article> getArticles() {
		String getArticlesUrl = props.getApiUrl() + "/article";
		ResponseEntity<Iterable<Article>> response = restTemplate.exchange(
				getArticlesUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<Article>>() {});
		return response.getBody();
	}
	
	public Iterable<Article> getCategory(Integer id) {
		String getArticlesUrl = props.getApiUrl() + "/article/category/" + id;
		ResponseEntity<Iterable<Article>> response = restTemplate.exchange(
				getArticlesUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<Article>>() {});
		return response.getBody();
	}
	
	public Iterable<Article> last(Integer nb) {
		String getArticlesUrl = props.getApiUrl() + "/article/last/" + nb;
		ResponseEntity<Iterable<Article>> response = restTemplate.exchange(
				getArticlesUrl, 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<Iterable<Article>>() {});
		return response.getBody();
	}
	
	public Article createArticle(Article article) {
		System.out.println(article);
		System.out.println(article.getAuthor_id());
		System.out.println(article.getCategory_id());
		System.out.println(article.getTitle());
		String createArticlesUrl = props.getApiUrl() + "/article";
		HttpEntity<Article> requestEntity = new HttpEntity<Article>(article);
		ResponseEntity<Article> response = restTemplate.exchange(
				createArticlesUrl, 
				HttpMethod.POST, 
				requestEntity, 
				Article.class);
		return response.getBody();
	}
	
	public void deleteArticle(Integer id) {
		String deleteArticlesUrl = props.getApiUrl() + "/article/" + id;
		ResponseEntity<Void> response = restTemplate.exchange(
				deleteArticlesUrl, 
				HttpMethod.DELETE,
				null,
				Void.class);
		System.out.println(response.getStatusCode().toString());		
	}
	
	public Article updateArticle(Article article) {
		String updateArticlesUrl = props.getApiUrl() + "/article/" + article.getId();
		HttpEntity<Article> requestEntity = new HttpEntity<Article>(article);
		ResponseEntity<Article> response = restTemplate.exchange(
				updateArticlesUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				Article.class);
		return response.getBody();
	}

	
	@SuppressWarnings("unused")
	private Iterable<Article> fallback(IllegalStateException ex) {
		System.out.println("From fallback method IllegalState : " + ex.getMessage());
		return new ArrayList<Article>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<Article> fallback(TimeoutException ex) {
		System.out.println("From fallback method Timeout : " + ex.getMessage());
		return new ArrayList<Article>();
	}
	
	@SuppressWarnings("unused")
	private Iterable<Article> fallback(HttpServerErrorException ex) {
		System.out.println("From fallback method HttpServerErrorException : " + ex.getMessage());
		return new ArrayList<Article>();
	}

}
