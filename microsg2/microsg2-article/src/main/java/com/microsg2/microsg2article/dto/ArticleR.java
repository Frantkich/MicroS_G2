package com.microsg2.microsg2article.dto;

import java.util.Date;

import com.microsg2.microsg2article.model.YAuthor;
import com.microsg2.microsg2article.model.YCategory;
import com.microsg2.microsg2article.model.YComment;

public class ArticleR {
	
	private int id;

	private String title;
	
	private Date date;
	
	private String content;
	
	private YAuthor author;
	
	private YCategory category;
	
	private YComment[] comments;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public YAuthor getAuthor() {
		return author;
	}

	public void setAuthor(YAuthor author) {
		this.author = author;
	}

	public YCategory getCategory() {
		return category;
	}

	public void setCategory(YCategory category) {
		this.category = category;
	}
	
	public YComment[] getComments() {
		return comments;
	}

	public void setComments(YComment[] comments) {
		this.comments = comments;
	}

}
