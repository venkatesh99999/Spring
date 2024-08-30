package com.org.SpringDataJPA;

import org.hibernate.mapping.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.DAO.StudentDAOImpl;
import com.org.DAO.StudentRepo;
import com.org.Entity.Student;
import com.org.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	StudentDAOImpl stuDAO=context.getBean("studentDAOImpl",StudentDAOImpl.class);
       Student student=new Student();
       student.setId(1);
       student.setName("reddy");
       student.setMobileno(97049210);
    //   stuDAO.saveStudent(student);
   	//java.util.List<Student> list=stuDAO.getAll();
    	StudentRepo sr=context.getBean("studentRepo",StudentRepo.class);
    	//sr.save(student);
     System.out.println(sr.findById(9));
       // list.forEach(s->System.out.println(s));
       
    }
}
