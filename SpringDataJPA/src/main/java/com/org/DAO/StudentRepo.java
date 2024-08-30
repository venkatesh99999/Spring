package com.org.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>  {

}
