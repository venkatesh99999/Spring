package com.hybernate.tutorial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernate.entity.Student;

import jakarta.persistence.Entity;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config=new Configuration();
        //need to add this to add entity class to config file
        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sf=config.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Student s=new Student();
        s.setId(1);
        s.setName("venkat");
        s.setMobileno(99494210);
        session.beginTransaction();
        
        session.save(s);
        
        session.getTransaction().commit();
        session.close();
        Session session2=sf.openSession();
        Student stu=session.get(Student.class, 1);
        System.out.println(stu.getName());
        System.out.println("Sucessfully saved");
        
    }
}
