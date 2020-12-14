package com.microsg2.microsg2author.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2author.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>  {

}
