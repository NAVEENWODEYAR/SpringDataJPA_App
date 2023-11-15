package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.modal.Student;
import com.jpa.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService
{
	// Constructor dependency injection,
	@Autowired
	private StudentRepo studentRepo;
	
	// CRUD 
	//1. INSERT INTO table_name VALUES();
	public Student insertStudent(Student student)
	{
		Student st =  studentRepo.save(student);
		log.info("Student {},saved to the database",student.getFaName());
		return st;
	}
	
	// 2. Select * from table_name,
	public List<Student> getStudents()
	{
		List<Student> students = studentRepo.findAll();
		return students;
	}
	
	// 3. findByFirstName
	public Student getByName(String faName)
	{
		return studentRepo.findByFaName(faName);
	}
	
	// 4. findByNameContaining
	public List<Student> getByNameContainig(String name)
	{
		return studentRepo.findByFaNameContaining(name);
	}
	
	// 5. findBylNameNotNull
	public List<Student> getBylNameNotNull()
	{
		return studentRepo.findByLaNameNotNull();
	}
	
	// 6. findByFirstName&LastName
	public Student findByFirstNameAndLastname(String faName, String laName)
	{
		return studentRepo.findByFaNameAndLaName(faName, laName);
	}
	
	// JPQL queries,
	// 1. ORDER By 
	public List<Student> getStudentsASC()
	{
		return studentRepo.getStudentOrderByfirstName();
	}
	
	public List<Student> getStudentsASCFaname()
	{
		return studentRepo.getStudentOrderByfirstName();
	}
}
