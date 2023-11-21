package com.example.demo;

public class Book {
	
	private String title;
	
	private String author;
	
	
	/**
	 * @param title
	 * @param author
	 */
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
