package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.service.StudentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		StudentService studentservice=new StudentService();
		
		//Adding new students to the list
		studentservice.addStudent(new Student(01,"John",50));
		studentservice.addStudent(new Student(02,"David",90));
		
		//Fetching and displaying the students
		System.out.println("Total list of students : ");
		studentservice.fetchAllStudents();
		
		//Fetching student by passing Id
		System.out.println("Fetching user 01 by Id : ");
		studentservice.fetchStudent(01);
		
		//Updating scores and observing scoring system
		System.out.println("Updating score for John : ");
		studentservice.updateScore(60,01);
		System.out.println("Updating score for David : ");
		studentservice.updateScore(100,02);
		
		//Removing a student
		System.out.println("Removing John from students list: ");
		studentservice.deleteStudent(01);
	}

}
