package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {

private Student student;

/**
 * @param student
 */
@Autowired
public Classroom(Student student) {
	super();
	this.student = student;
}

//Method to display details of student
public void displayStudentDetails()
{
	System.out.println("Student Details : ");

	System.out.println("Name : "+ student.getName()+ " ; Age : "+student.getAge());
}


}
