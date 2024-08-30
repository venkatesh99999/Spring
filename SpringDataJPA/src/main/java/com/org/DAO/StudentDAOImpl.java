package com.org.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.org.Entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl {


    @Autowired
	EntityManagerFactory emf;
	
	@Transactional
	public void saveStudent(Student student) {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("Saved");
	}
	
	public Student getStudent(Integer id)
	{
		Student s;
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		s=em.find(Student.class, id);
		em.getTransaction().commit();
		return s;
	}
	public void deleteStudent(int id)
	{
		//em.c
		
	}
	
	public List<Student> getAll()
	{
		EntityManager em=emf.createEntityManager();
		TypedQuery<Student> query=em.createQuery("from Student",Student.class);
		
	    return query.getResultList();
	}

}
