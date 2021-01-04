package com.microsg2.microsg2client.model;

import java.sql.Date;

public class Article {

	private Integer id;
	private String title;
	private Date date;
	private String content;
	private YAuthor author;
	private Integer author_id;
	private Iterable<YComment> comments;
	private Integer category_id;

	public Integer getId() {
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

	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
}
