package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.example.entity.Student;

@Service
public class StudentService implements InitializingBean, DisposableBean {
	
	private static final List<Student> students=new ArrayList<>();
	
	//Add a new student to a list
	public void addStudent(Student student)
	{
		students.add(student);
		System.out.println("New student has been added");		
	}
	
	//Fetch all students
	public void fetchAllStudents()
	{
		for(Student stud : students)
		{
			System.out.println("Id : "+stud.getId()+" ; Name : "+stud.getName()+" ; Score : "+stud.getScore());
		}
	}
	
	//Fetch a student by Id
	public void fetchStudent(int id)
	{
		for(Student stud : students)
		 {
			if(stud.getId()==id)
			{
				System.out.println("Id : "+stud.getId()+" ; Name : "+stud.getName()+" ; Score : "+stud.getScore());
			}
		 }
	}
	
	//Update the score of a student
	public void updateScore(int score,int id)
	{
		for(Student stud : students)
		 {
			if(stud.getId()==id)
			{
			System.out.println("Id : "+stud.getId()+" ; Name : "+stud.getName()+" ; Old Score : "+stud.getScore());
			stud.setScore(score);
			System.out.println("Id : "+stud.getId()+" ; Name : "+stud.getName()+" ; New Score : "+stud.getScore());
			scoringSystem(score);
			}
		}
	}
	
	//Delete a student
	public void deleteStudent(int id)
	{
		students.remove(id);
		System.out.println("Student has been removed");
		System.out.println("Updated students list : ");
		fetchAllStudents();
	}
	
	//Scoring system
	public void scoringSystem(int score)
	{
			if(score<50)
			{
				System.out.println("The students score is Below Average");
			}
			if(score>50 && score<75)
			{
				System.out.println("The students score is Average");				
			}
			if(score>75)
			{
				System.out.println("The students score is Above Average");				
			}
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("StudentService is being destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("StudentService has been initialised");
	}
}
