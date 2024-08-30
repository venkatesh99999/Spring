package com.org.com.org.springdatademo;

import com.org.DAO.StudentRepoImpl;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.DAO.*;
import com.org.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student s=new Student();
        StudentRepoImpl sp=context.getBean("studentRepoImpl", StudentRepoImpl.class);
        StudentRepo sdao=context.getBean("studentRepo", StudentRepo.class);
        //s.setId(1);
        s.setName("Harika");
        s.setMobile(99494210);
        sp.saveStudent(s);

        List<Student> all = sdao.findAll();
        for(Student stu:all)
        {
        	System.out.println(stu.toString());
        }
        
        }
}
