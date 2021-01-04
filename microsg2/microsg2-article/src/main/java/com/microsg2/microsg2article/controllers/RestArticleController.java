package com.microsg2.microsg2article.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microsg2.microsg2article.dto.ArticleR;
import com.microsg2.microsg2article.repositories.ArticleRepository;
import com.microsg2.microsg2article.service.ArticleService;
import com.microsg2.microsg2article.model.Article;

@RestController
public class RestArticleController {

	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping("/article")
	public Iterable<ArticleR> getArticles() {
		return articleService.getArticles();
	}
	
	@GetMapping("/article/{id}")
	public ArticleR getArticle(@PathVariable("id") int id) {
		return articleService.getArticle(id);
	}
	
	@GetMapping("/article/category/{id}")
	public Iterable<ArticleR> getCategory(@PathVariable("id") int id) {
		return articleService.getCategory(id);
	}	

	@GetMapping("/article/last/{nb}")
	public Iterable<ArticleR> getLast(@PathVariable("nb") int nb) {
		return articleService.getLast(nb);
	}
	
	@PostMapping("/article")
	public Article createCategory(@RequestBody Article article) {
		Date date = new Date();
		article.setDate(date);
		article = articleRepository.save(article);		
		return article;
	}
	
}
