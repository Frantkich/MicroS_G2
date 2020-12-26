package com.microsg2.microsg2article.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2article.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
	@Query(value = "SELECT * FROM article WHERE article.category_id = :id", 
		   nativeQuery = true)
	Iterable<Article> getCategory(@Param("id") int id);
}
