package com.microsg2.microsg2author.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2author.models.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>  {
	
	@Query(
			  value = "SELECT * FROM author WHERE author.username = :username", 
			  nativeQuery = true)
	Optional<Author> findAuthorWithName(@Param("username") String username);
	
}
