package com.microsg2.microsg2comment.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2comment.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{
	@Query(
			  value = "SELECT * FROM comment WHERE comment.article_id = :id", 
			  nativeQuery = true)
	Optional<Iterable<Comment>> getArticle(@Param("id") int id);
}
