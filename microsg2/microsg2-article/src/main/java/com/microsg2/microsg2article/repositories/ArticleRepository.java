package com.microsg2.microsg2article.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2article.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
	
}
