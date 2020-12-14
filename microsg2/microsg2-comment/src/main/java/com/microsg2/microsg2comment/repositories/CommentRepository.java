package com.microsg2.microsg2comment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2comment.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}
