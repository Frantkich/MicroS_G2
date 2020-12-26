package com.microsg2.microsg2client.model;

import java.sql.Date;

public class Article {

	private Integer id;
	private String title;
	private Date date;
	private String content;
	private YAuthor author;
	private Iterable<YComment> comments;
	private int categoryId;

	public int getId() {
		return id;
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

	public Iterable<YComment> getComments() {
		return comments;
	}

	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
