package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Student;

public class StudentDao 
{
	public void save(Student student) 
	{
		EntityManagerFactory entityManagerFatory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager	= entityManagerFatory.createEntityManager();
		EntityTransaction entityTransaction	= entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		System.out.println("Student Data added Successfully....");
	}
	
	public void fetchById(int student_id)
	{
		EntityManagerFactory entityManagerFatory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager	= entityManagerFatory.createEntityManager();
		
//		EntityTransaction is not needed in case of data fetching as it is not affecting the table
//		EntityTransaction entityTransaction	= entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, student_id);
		
		System.out.println();
		System.out.println("Student Id : " + student.getStudent_id());
		System.out.println("Student Name : " + student.getStudent_name());
		System.out.println("Student Class : " + student.getStudent_class());
		System.out.println("Student Contact : " + student.getStudent_contact());
		
		System.out.println();
		System.out.println("Student Data Fetch Successfully ........");
	}
	
	public void fetchAll()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query= entityManager.createQuery("SELECT x FROM Student x ");
		
		List<Student> list = query.getResultList();
		
		System.out.println();
		for(Student student: list)
		{
			System.out.println("Student Id : " + student.getStudent_id());
			System.out.println("Student Name : " + student.getStudent_name());
			System.out.println("Student Class : " + student.getStudent_class());
			System.out.println("Student Contact : " + student.getStudent_contact());
			System.out.println();
		}
		System.out.println();
		System.out.println("Student Data Fetch Successfully ........");
	}
	
	public void update(Student student)
	{
		
		EntityManagerFactory entityManagerFatory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager	= entityManagerFatory.createEntityManager();
		EntityTransaction entityTransaction	= entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
		System.out.println("Data Has Been Updated Successfully......");
		
	}
	
	public void deleteById(int student_id)
	{
	
		EntityManagerFactory entityManagerFatory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager	= entityManagerFatory.createEntityManager();
		EntityTransaction entityTransaction	= entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, student_id);
	
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		
		System.out.println("Data Has Been Deleted Successfully.....");
	
	}
	
	public void deleteAll()
	{
		EntityManagerFactory entityManagerFatory = Persistence.createEntityManagerFactory("Dev");
		EntityManager entityManager	= entityManagerFatory.createEntityManager();
		EntityTransaction entityTransaction	= entityManager.getTransaction();
		
		Query query = entityManager.createQuery("DELETE FROM Student");
	
		entityTransaction.begin();
		query.executeUpdate();
		entityTransaction.commit();
		
		System.out.println("All The Data Has Been Deleted Successfully");
	}
	
	
	
}