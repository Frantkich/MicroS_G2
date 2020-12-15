package com.microsg2.microsg2article.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.microsg2.microsg2article.model.YAuthor;
import com.microsg2.microsg2article.model.YCategory;

public class ArticleR {
	
	private int id;

	private String title;
	
	private Date date;
	
	private String content;
	
	private YAuthor author;
	
	private YCategory category;
	
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
}
