package com.org.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	//public void saveStudent(Student student);
	
}
