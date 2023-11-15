package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.modal.Student;
import com.jpa.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController
{
	// Dependency Injection(constructor)
	@Autowired
	private StudentService studentService;
	
	// API,
	@GetMapping("/testMsg")
	public String testMsg()
	{
		return "Mapping in JPA,";
	}
	
	@PostMapping("/insertStudent")
	public Student insertStudent(@RequestBody Student student)
	{
		return studentService.insertStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		List<Student> students = studentService.getStudents();
		return students;
	}
	
	@GetMapping("/getByName")
	public Student getByName(String fName)
	{
		return studentService.getByName(fName);
	}
	
	@GetMapping("/getByNameContainig")
	public List<Student> getByNameContainig(String name)
	{
		return studentService.getByNameContainig(name);
	}
	
	@GetMapping("/getBylNameNotNull")
	public List<Student> getBylNameNotNull()
	{
		return studentService.getBylNameNotNull();
	}
	
	@GetMapping("/getByFirstName&LastName")
	public Student findByFirstNameAndLastname(String faName, String laName)
	{
		return studentService.findByFirstNameAndLastname(faName, laName);
	}
	
	@GetMapping("/getStudentsASC")
	public List<Student> getStudentsASC()
	{
		return studentService.getStudentsASC();
	}
	
	@GetMapping("/getStudentASCfirstName")
	public List<Student> getStudentsASCFaname()
	{
		return studentService.getStudentsASCFaname();
	}
}
