package com.microsg2.microsg2client.repository;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2client.model.Article;

@Repository
public class ArticleProxy extends GenericProxy {

	public Article getArticle(int id) {
		String getArticleUrl = props.getApiUrl() + "/article/" + id;
		ResponseEntity<Article> response = restTemplate.exchange(
				getArticleUrl, HttpMethod.GET, null, Article.class);
		return response.getBody();
	}
}
