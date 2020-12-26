package com.microsg2.microsg2article.model;

import java.sql.Date;

public class YComment {
	
	private Integer id;
	private Date date;
	private String content;
	private Integer article_id;
	private YAuthor author;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public YAuthor getAuthor() {
		return author;
	}
	public void setAuthor(YAuthor author) {
		this.author = author;
	}
}
