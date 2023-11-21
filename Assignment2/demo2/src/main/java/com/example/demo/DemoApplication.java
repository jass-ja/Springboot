package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
	}
	
	//Bean creation for Book class
	@Bean
	public Book book()
	{
		return new Book("Ikigai","Hector");
	}

	//Bean creation for Student class
	@Bean
	public Student student()
	{
		return new Student("John",16);
	}

	//Bean creation for Library class
	@Bean
	public Library library()
	{
		return new Library(book());

	}

	//Bean creation for Classroom class
	@Bean
	public Classroom classroom()
	{
		return new Classroom(student());

	}
	
}
