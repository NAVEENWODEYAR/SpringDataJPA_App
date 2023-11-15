package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.modal.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	Student findByFaName(String faName);
	List<Student> findByFaNameContaining(String name);
	List<Student> findByLaNameNotNull();
	Student findByFaNameAndLaName(String fName, String lName);

	// JPQL queries
	@Query(value = "SELECT * FROM map_Student  ORDER BY map_Student.faName",nativeQuery = true)
	List<Student> getStudentOrderByfirstName();
	
//	@Query(value = "SELECT s FROM Student s WHERE s.Student MailId=?1")
//	Student getStudent(String stMail);
	
	@Query(value = "SELECT * FROM map_Student ORDER BY map_Student.First Name ",nativeQuery = true)
	List<Student> getStudentsASCFaName();
}
