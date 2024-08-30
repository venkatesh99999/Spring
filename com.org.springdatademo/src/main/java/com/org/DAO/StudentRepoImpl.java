package com.org.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
//import jakarta.transaction.Transactional;

@Repository(value = "studentRepoImpl")
public class StudentRepoImpl{
	
	//@PersistenceContext(unitName = "sqldb")
	@Autowired // spring data jpa stuff 
	EntityManager entityManager;

	@Transactional
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		//entityManager.getTransaction().begin();
		
		entityManager.persist(student);
		//Query nativeQuery = entityManager.createNativeQuery("select * from student", Student.class);
		//List<Student> list=nativeQuery.getResultList();
		//System.out.println(list.get(0).getName());
		
//		Query nativeQuery = entityManager.createNativeQuery("update student set name='harika' where studentId=2", Student.class);
//		int id=nativeQuery.executeUpdate();
		//entityManager.getTransaction().commit();
//		System.out.println("Record Updated with id:"+id);
		
	}
	

}
