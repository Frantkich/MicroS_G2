package com.microsg2.microsg2category.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microsg2.microsg2category.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
