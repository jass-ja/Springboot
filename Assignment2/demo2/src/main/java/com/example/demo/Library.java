package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Library {
	
	@Autowired
	private Book book;	
	
	/**
	 * @param book
	 */
	public Library(Book book) {
		super();
		this.book = book;
	}

	//Method to display details of book
	public void displayBookDetails()
	{
		System.out.println("Book Details : ");

		System.out.println("Title : "+ book.getTitle()+ " ; Author : "+book.getAuthor());
	}
}
