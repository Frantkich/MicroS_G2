package com.microsg2.microsg2article.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsg2.microsg2article.dto.ArticleR;
import com.microsg2.microsg2article.dto.ArticleTransformer;
import com.microsg2.microsg2article.model.Article;
import com.microsg2.microsg2article.repositories.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private ArticleTransformer articleTransformer;
	
	public ArticleR getArticle(int id) {
		Article article = articleRepository.findById(id).get();
		ArticleR articleR = articleTransformer.transform(article);
		return articleR;
	}
	
	public Iterable<ArticleR> getArticles() {
		Iterable<Article> articles = articleRepository.findAll();
		ArrayList<ArticleR> articleRs = new ArrayList<ArticleR>();
		
		Iterator<Article> iterator = articles.iterator();
		System.out.println(iterator);
		while(iterator.hasNext()) {
			System.out.println("dans le while");
			Article p = iterator.next();
			System.out.println(p);
			ArticleR articleR = articleTransformer.transform(p);
			articleRs.add(articleR);
		}
		return articleRs;		
	}

	public Iterable<ArticleR> getCategory(int id) {
		Iterable<Article> articles = articleRepository.getCategory(id);
		ArrayList<ArticleR> articleRs = new ArrayList<ArticleR>();
		
		Iterator<Article> iterator = articles.iterator();
		while(iterator.hasNext()) {
			Article p = iterator.next();
			ArticleR articleR = articleTransformer.transform(p);
			articleRs.add(articleR);
		}
		return articleRs;		
	}
}
