package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class RegistrationDAO 
{
   @Autowired
   private SessionFactory fact;
   public RegistrationDAO() 
   {
	  System.out.println("Registraion DAO Created");
   }
   
   /*insert code*/
   public void studentRegistrationDAO(Student s)
   {
	   Session session=fact.openSession();
	   Transaction tx=session.beginTransaction();
	   session.save(s);
	   tx.commit();
	   System.out.println("Successfully Saved");
   }
   
   /*select code*/
   public List<Student> viewAllStudentsDAO()
   {
	   Session session=fact.openSession();
	   List<Student> allStudents=session.createQuery("from Student").getResultList();
	   return allStudents;
   }
   
   /*select student by id*/
   public Student viewStudentDAOById(int sid)
   {
	   Session session=fact.openSession();
	   Student student=session.get(Student.class, sid);
	   return student;
   }
}
