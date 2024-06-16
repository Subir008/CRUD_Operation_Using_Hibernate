package Controller;

import java.util.Scanner;

import Dao.StudentDao;
import Dto.Student;

public class Insertion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id : ");
		int student_id = sc.nextInt();
		
		System.out.println("Enter Student Name : ");
		String student_name = sc.next();
		
		System.out.println("Enter Student Class : ");
		int student_class = sc.nextInt();
		
		System.out.println("Enter Student Contact : ");
		String student_contact = sc.next();
		
		Student student = new Student();
		student.setStudent_id(student_id);
		student.setStudent_name(student_name);
		student.setStudent_class(student_class);
		student.setStudent_contact(student_contact);
		
		StudentDao studentdao = new StudentDao();
		studentdao.save(student);
		
	}
}