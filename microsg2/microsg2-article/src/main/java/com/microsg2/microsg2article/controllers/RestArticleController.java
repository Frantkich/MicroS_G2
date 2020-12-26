package com.microsg2.microsg2article.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microsg2.microsg2article.dto.ArticleR;
import com.microsg2.microsg2article.service.ArticleService;

@RestController
public class RestArticleController {

	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/article/{id}")
	public ArticleR getArticle(@PathVariable("id") int id) {
		return articleService.getArticle(id);
	}
	
	@GetMapping("/article")
	public Iterable<ArticleR> getAticles() {
		return articleService.getArticles();
	}
	
	@GetMapping("/article/category/{id}")
	public Iterable<ArticleR> getCategory(@PathVariable("id") int id) {
		return articleService.getCategory(id);
	}
	
}
