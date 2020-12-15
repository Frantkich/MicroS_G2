package com.microsg2.microsg2article.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microsg2.microsg2article.model.Article;
import com.microsg2.microsg2article.model.YAuthor;
import com.microsg2.microsg2article.model.YCategory;
import com.microsg2.microsg2article.repositories.AuthorProxy;
import com.microsg2.microsg2article.repositories.CategoryProxy;

@Component
public class ArticleTransformer {

	@Autowired
	private CategoryProxy categoryProxy;
	
	@Autowired
	private AuthorProxy authorProxy;
	
	public ArticleR transform(Article a) {
		ArticleR articleR = new ArticleR();
		articleR.setId(a.getId());
		articleR.setTitle(a.getTitle());
		articleR.setDate(a.getDate());
		articleR.setContent(a.getContent());
		YAuthor author = authorProxy.getAuthor(a.getAuthorId());
		articleR.setAuthor(author);
		YCategory category = categoryProxy.getCategory(a.getCategoryId());
		articleR.setCategory(category);
		
		return articleR;
	}
	
}